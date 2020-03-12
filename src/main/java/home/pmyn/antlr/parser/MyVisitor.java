package home.pmyn.antlr.parser;


import home.pmyn.antlr.PmynBaseVisitor;
import home.pmyn.antlr.PmynParser;
import home.pmyn.antlr.PmynParser.AndOrLogicContext;
import home.pmyn.antlr.PmynParser.BooleanRefContext;
import home.pmyn.antlr.PmynParser.EqualityComparisonContext;
import home.pmyn.antlr.PmynParser.ExprStatementContext;
import home.pmyn.antlr.PmynParser.ListGetIndexContext;
import home.pmyn.antlr.PmynParser.MulDivContext;
import home.pmyn.antlr.PmynParser.NotExprContext;
import home.pmyn.antlr.PmynParser.ObjectAttributeContext;
import home.pmyn.support.function.BuiltInFunction;
import home.pmyn.antlr.PmynParser.AddSubContext;
import home.pmyn.antlr.PmynParser.FuncCallContext;
import home.pmyn.antlr.PmynParser.FuncDefContext;
import home.pmyn.antlr.PmynParser.ListRefContext;
import home.pmyn.antlr.PmynParser.NumRefContext;
import home.pmyn.antlr.PmynParser.ReturnStatementContext;
import home.pmyn.antlr.PmynParser.StringRefContext;
import home.pmyn.antlr.PmynParser.UnaryMinusContext;
import home.pmyn.antlr.PmynParser.VarAssginmentContext;
import home.pmyn.antlr.PmynParser.VarRefContext;
import home.pmyn.support.function.Function;
import home.pmyn.support.function.UserDefinedFunction;
import home.pmyn.support.operand.BooleanOperand;
import home.pmyn.support.operand.ListOperand;
import home.pmyn.support.operand.NumberOperand;
import home.pmyn.support.operand.ObjectOperand;
import home.pmyn.support.operand.Operand;
import home.pmyn.support.operand.StringOperand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ParserRuleContext;

import static home.pmyn.helper.MessageFormatHelper.format;
public class MyVisitor extends PmynBaseVisitor<Operand> {

  Map<String, Operand>  variables = new HashMap<>();
  Map<String, Function> functionMap = Map.of(
      "pow", BuiltInFunction.Pow,
      "print", BuiltInFunction.Print,
      "map",BuiltInFunction.Map,
      "sub", BuiltInFunction.Sub,
      "object", BuiltInFunction.CreateObject);
  Map<String, Function> userDefinedFunc = new HashMap<>();

  public MyVisitor() {}

  public MyVisitor(Map<String, Operand> variables) {
    this.variables.putAll(variables);
  }

  @Override
  public Operand visitVarAssginment(VarAssginmentContext ctx) {
    if (ctx.ASSIGN() == null) {
      return null;
    }

    String variableName = ctx.ID().getText();
    Operand assignedValue = visit(ctx.expr());
    variables.put(variableName, assignedValue);
    return assignedValue;
  }

  @Override
  public Operand visitReturnStatement(ReturnStatementContext ctx) {
    return super.visitReturnStatement(ctx);
  }

  @Override
  public Operand visitExprStatement(ExprStatementContext ctx) {
    return visit(ctx.expr());
  }

  @Override
  public Operand visitStringRef(StringRefContext ctx) {
    String fullStringRef = ctx.STRING().getText();
    return new StringOperand(fullStringRef.substring(1, fullStringRef.length()-1));
  }

  @Override
  public Operand visitObjectAttribute(ObjectAttributeContext ctx) {
    Operand object = variables.get(ctx.ID(0).getText());
    if (!(object instanceof ObjectOperand))
      throw new IllegalArgumentException(ctx.ID(0).getText() + " not a object ");
    String attributeName = ctx.ID(1).getText();
    return ((ObjectOperand)object).getAttribute(attributeName);
  }

  @Override
  public Operand visitVarRef(VarRefContext ctx) {
    String key = ctx.ID().getText();
    if (variables.containsKey(key))
      return variables.get(key);

    if (userDefinedFunc.containsKey(key))
      return userDefinedFunc.get(key);

    throw new IllegalArgumentException("Not found variable " + ctx.ID().getText());
  }

  @Override
  public Operand visitListRef(ListRefContext ctx) {
    return new ListOperand(ctx.sublist().sub().stream().map(this::visit).collect(Collectors.toUnmodifiableList()));
  }

  @Override
  public Operand visitUnaryMinus(UnaryMinusContext ctx) {
    Operand operand = visit(ctx.expr());
    if (!(operand instanceof NumberOperand))
      throw new IllegalArgumentException("Bad operand for unary -");

    NumberOperand casted = (NumberOperand)operand;
    return new NumberOperand(-casted.getNum());
  }

  @Override
  public Operand visitNumRef(NumRefContext ctx) {
    return new NumberOperand(Double.valueOf(ctx.NUMBER().getText()));
  }

  @Override
  public Operand visitListGetIndex(ListGetIndexContext ctx) {
    if (!(variables.get(ctx.ID().getText()) instanceof ListOperand)) {
      throw new IllegalArgumentException(ctx.ID().getText() + " is not a list");
    }
    int index = Integer.parseInt(ctx.expr().getText());
    ListOperand list = (ListOperand)variables.get(ctx.ID().getText());
    return list.getOperands().get(index);
  }

  @Override
  public Operand visitBooleanRef(BooleanRefContext ctx) {
    boolean val = Boolean.valueOf(ctx.booleanLiteral().getText());
    return BooleanOperand.parse(val);
  }

  @Override
  public Operand visitNotExpr(NotExprContext ctx) {
    return super.visitNotExpr(ctx);
  }

  @Override
  public Operand visitEqualityComparison(EqualityComparisonContext ctx) {
    Operand first = visit(ctx.expr(0));
    Operand second = visit(ctx.expr(1));

    if (!(first instanceof NumberOperand) || !(second instanceof NumberOperand))
      throw new IllegalArgumentException(ctx.expr(0).getText() + " and " + ctx.expr(1).getText() + " must be Number");
    double n1 = ((NumberOperand)first).getNum();
    double n2 = ((NumberOperand)second).getNum();

    boolean result;
    switch (ctx.op.getType()) {
      case PmynParser.EQUALS: result = n1 == n2; break;
      case PmynParser.NOT_EQ_1:
      case PmynParser.NOT_EQ_2: result = n1 != n2; break;
      case PmynParser.GREATER_THAN: result = n1 > n2; break;
      case PmynParser.GT_EQ: result = n1 >= n2; break;
      case PmynParser.LESS_THAN: result = n1 < n2; break;
      case PmynParser.LT_EQ: result = n1 <= n2; break;
      default: throw new IllegalArgumentException(format("{} operator not valid", ctx.op.getText()));
    }

    return BooleanOperand.parse(result);
  }

  @Override
  public Operand visitAndOrLogic(AndOrLogicContext ctx) {
    Operand left = visit(ctx.expr(0));
    Operand right = visit(ctx.expr(1));
    if (!(left instanceof BooleanOperand) || !(right instanceof BooleanOperand))
      throw new IllegalArgumentException(format("{} and {} must be boolean", ctx.expr(0).getText(), ctx.expr(1).getText()));

    boolean b1 = ((BooleanOperand)left).getValue();
    boolean b2 = ((BooleanOperand)left).getValue();
    boolean result;
    switch (ctx.op.getType()) {
      case PmynParser.AND: result = b1 && b2; break;
      case PmynParser.OR: result = b1 || b2; break;
      default: throw new IllegalArgumentException(format("{} operator not valid", ctx.op.getText()));
    }
    return BooleanOperand.parse(result);
  }

  @Override
  public Operand visitFuncCall(FuncCallContext ctx) {
    Function f;
    if (functionMap.containsKey(ctx.ID().getText()))
      f = functionMap.get(ctx.ID().getText());
    else if (userDefinedFunc.containsKey(ctx.ID().getText()))
      f = userDefinedFunc.get(ctx.ID().getText());
    else
      throw new IllegalArgumentException("Not found function " + ctx.ID().getText());

    if (ctx.varArgs() == null)
      return f.apply();

    Operand[] operands = ctx.varArgs()
        .exprList()
        .expr()
        .stream()
        .map(this::visit)
        .toArray(Operand[]::new);

    return f.apply(operands);
  }

  @Override
  public Operand visitFuncDef(FuncDefContext ctx) {

    List<String> paramIds =
        ctx.functionDecl().varArgs().exprList().expr().stream()
            .map(ParserRuleContext::getText)
            .collect(Collectors.toUnmodifiableList());
    Function udFunc = new UserDefinedFunction(ctx.functionDecl().ID().getText(), paramIds, ctx.functionDecl().funcBody());
    userDefinedFunc.put(ctx.functionDecl()
        .ID().getText(), udFunc);
    return udFunc;
  }

  @Override
  public Operand visitAddSub(AddSubContext ctx) {
    switch (ctx.op.getType()) {
      case PmynParser.ADD_OPERATOR: return BuiltInFunction.Add.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      case PmynParser.SUB_OPERATOR: return BuiltInFunction.Sub.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      default: throw new IllegalArgumentException("Illegal type " + ctx.op.getType());
    }
  }

  @Override
  public Operand visitMulDiv(MulDivContext ctx) {
    switch (ctx.op.getType()) {
      case PmynParser.MUL_OPERATOR: return BuiltInFunction.Multiply.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      case PmynParser.DIV_OPERATOR: return BuiltInFunction.Divide.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      default: throw new IllegalArgumentException("Illegal type " + ctx.op.getType());
    }
  }
}
