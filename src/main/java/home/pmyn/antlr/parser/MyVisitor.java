package home.pmyn.antlr.parser;


import home.pmyn.antlr.PmynBaseVisitor;
import home.pmyn.antlr.PmynParser;
import home.pmyn.antlr.PmynParser.AndOrLogicContext;
import home.pmyn.antlr.PmynParser.BooleanLiteralContext;
import home.pmyn.antlr.PmynParser.DecimalLiteralContext;
import home.pmyn.antlr.PmynParser.EqualityComparisonContext;
import home.pmyn.antlr.PmynParser.ExprInsideParensContext;
import home.pmyn.antlr.PmynParser.ExprStatementContext;
import home.pmyn.antlr.PmynParser.IntegerLiteralContext;
import home.pmyn.antlr.PmynParser.ListGetIndexContext;
import home.pmyn.antlr.PmynParser.LiteralRefContext;
import home.pmyn.antlr.PmynParser.MulDivContext;
import home.pmyn.antlr.PmynParser.NotExprContext;
import home.pmyn.antlr.PmynParser.ObjectAttributeContext;
import home.pmyn.antlr.PmynParser.StringLiteralContext;
import home.pmyn.antlr.PmynParser.VarAssignmentContext;
import home.pmyn.support.datatype.PmynType.Type;
import home.pmyn.support.function.BuiltInFunction;
import home.pmyn.antlr.PmynParser.AddSubContext;
import home.pmyn.antlr.PmynParser.FuncCallContext;
import home.pmyn.antlr.PmynParser.FuncDefContext;
import home.pmyn.antlr.PmynParser.ListRefContext;
import home.pmyn.antlr.PmynParser.ReturnStatementContext;
import home.pmyn.antlr.PmynParser.UnaryMinusContext;
import home.pmyn.antlr.PmynParser.VarRefContext;
import home.pmyn.support.function.Function;
import home.pmyn.support.function.UserDefinedFunction;
import home.pmyn.support.datatype.BooleanPmynType;
import home.pmyn.support.datatype.IntegerPmynType;
import home.pmyn.support.datatype.ListPmynType;
import home.pmyn.support.datatype.DecimalPmynType;
import home.pmyn.support.datatype.ObjectPmynType;
import home.pmyn.support.datatype.PmynType;
import home.pmyn.support.datatype.StringPmynType;
import home.pmyn.support.scope.DefaultScope;
import home.pmyn.support.scope.GlobalScope;
import home.pmyn.support.scope.PmynScope;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ParserRuleContext;

import static home.pmyn.helper.MessageFormatHelper.format;
public class MyVisitor extends PmynBaseVisitor<PmynType> {

  private final PmynScope curScope;

  public MyVisitor() {
    this.curScope = new DefaultScope(GlobalScope.newInstance());
  }

  public MyVisitor(PmynScope scope) {
    this.curScope = scope;
  }

  public MyVisitor(Map<String, PmynType> variables) {
    curScope = new DefaultScope(GlobalScope.newInstance(), variables);
  }

  @Override
  public PmynType visitVarAssignment(VarAssignmentContext ctx) {
    if (ctx.ASSIGN() == null) {
      return null;
    }

    String variableName = ctx.ID().getText();
    PmynType assignedValue = visit(ctx.expr());
    curScope.define(variableName, assignedValue);
    return assignedValue;
  }

  @Override
  public PmynType visitReturnStatement(ReturnStatementContext ctx) {
    return super.visitReturnStatement(ctx);
  }

  @Override
  public PmynType visitExprStatement(ExprStatementContext ctx) {
    return visit(ctx.expr());
  }

  @Override
  public PmynType visitObjectAttribute(ObjectAttributeContext ctx) {
    PmynType object = visit(ctx.expr());
    if (!(object instanceof ObjectPmynType))
      throw new IllegalArgumentException(ctx.expr().getText() + " NOT an object");
    String attributeName = ctx.ID().getText();
    return ((ObjectPmynType)object).getAttribute(attributeName);
  }

  @Override
  public PmynType visitVarRef(VarRefContext ctx) {
    String key = ctx.ID().getText();
    PmynType pmynVar = curScope.resolve(key);
    if (pmynVar == null)
      throw new IllegalArgumentException("Not found variable " + ctx.ID().getText());
    return pmynVar;
  }

  @Override
  public PmynType visitListRef(ListRefContext ctx) {
    return new ListPmynType(ctx.sublist().sub().stream().map(this::visit).collect(Collectors.toUnmodifiableList()));
  }

  @Override
  public PmynType visitUnaryMinus(UnaryMinusContext ctx) {
    PmynType pmynType = visit(ctx.expr());
    if (!(pmynType instanceof DecimalPmynType))
      throw new IllegalArgumentException("Bad operand for unary -");

    DecimalPmynType casted = (DecimalPmynType) pmynType;
    return new DecimalPmynType(-casted.getNum());
  }

  @Override
  public PmynType visitListGetIndex(ListGetIndexContext ctx) {
    PmynType l = visit(ctx.expr(0));
    if (!(l instanceof ListPmynType)) {
      throw new IllegalArgumentException(ctx.expr(0).getText() + " is NOT a list");
    }
    PmynType indexExpr = visit(ctx.expr(1));
    if (!(indexExpr instanceof IntegerPmynType)) {
      throw new IllegalArgumentException("List index must be integer");
    }

    // TODO: dangerous cast long to int
    int index = (int)((IntegerPmynType)indexExpr).getNum();
    ListPmynType list = (ListPmynType)l;
    return list.getPmynTypes().get(index);
  }

  @Override
  public PmynType visitLiteralRef(LiteralRefContext ctx) {
    return visit(ctx.literal());
  }

  @Override
  public PmynType visitDecimalLiteral(DecimalLiteralContext ctx) {
    double num = Double.parseDouble(ctx.FLOAT().getText());
    return new DecimalPmynType(num);
  }

  @Override
  public PmynType visitIntegerLiteral(IntegerLiteralContext ctx) {
    long num = Long.parseLong(ctx.INT().getText());
    return new IntegerPmynType(num);
  }

  @Override
  public PmynType visitStringLiteral(StringLiteralContext ctx) {
    String fullStringRef = ctx.STRING().getText();
    return new StringPmynType(fullStringRef.substring(1, fullStringRef.length()-1));
  }

  @Override
  public PmynType visitNotExpr(NotExprContext ctx) {
    return super.visitNotExpr(ctx);
  }

  @Override
  public PmynType visitEqualityComparison(EqualityComparisonContext ctx) {
    PmynType first = visit(ctx.expr(0));
    PmynType second = visit(ctx.expr(1));

    if (!(first instanceof DecimalPmynType) || !(second instanceof DecimalPmynType))
      throw new IllegalArgumentException(ctx.expr(0).getText() + " and " + ctx.expr(1).getText() + " must be Number");
    double n1 = ((DecimalPmynType)first).getNum();
    double n2 = ((DecimalPmynType)second).getNum();

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

    return BooleanPmynType.parse(result);
  }

  @Override
  public PmynType visitAndOrLogic(AndOrLogicContext ctx) {
    PmynType left = visit(ctx.expr(0));
    PmynType right = visit(ctx.expr(1));
    if (!(left instanceof BooleanPmynType) || !(right instanceof BooleanPmynType))
      throw new IllegalArgumentException(format("{} and {} must be boolean", ctx.expr(0).getText(), ctx.expr(1).getText()));

    boolean b1 = ((BooleanPmynType)left).getValue();
    boolean b2 = ((BooleanPmynType)left).getValue();
    boolean result;
    switch (ctx.op.getType()) {
      case PmynParser.AND: result = b1 && b2; break;
      case PmynParser.OR: result = b1 || b2; break;
      default: throw new IllegalArgumentException(format("{} operator NOT valid", ctx.op.getText()));
    }
    return BooleanPmynType.parse(result);
  }

  @Override
  public PmynType visitFuncCall(FuncCallContext ctx) {
    PmynType var = curScope.resolve(ctx.ID().getText());

    if (var == null)
      throw new IllegalArgumentException("Not found function " + ctx.ID().getText());
    if (var.type() != Type.function)
      throw new IllegalArgumentException(ctx.ID().getText() + " isn't a function");

    Function f = (Function)var;
    if (ctx.varArgs() == null)
      return f.apply();

    PmynType[] pmynTypes;
    if (ctx.varArgs().exprList() == null) {
      pmynTypes = new PmynType[0];
    } else {
      pmynTypes = ctx.varArgs().exprList().expr()
          .stream()
          .map(this::visit)
          .toArray(PmynType[]::new);
    }

    return f.apply(pmynTypes);
  }

  @Override
  public PmynType visitFuncDef(FuncDefContext ctx) {

    List<String> paramIds;
    if (ctx.functionDecl().varArgs().exprList() == null)
      paramIds = Collections.emptyList();
    else
      paramIds = ctx.functionDecl().varArgs().exprList().expr().stream()
            .map(ParserRuleContext::getText)
            .collect(Collectors.toUnmodifiableList());
    PmynScope scope = new DefaultScope(curScope);
    Function udFunc = new UserDefinedFunction(ctx.functionDecl().ID().getText(), paramIds, ctx.functionDecl().funcBody(), scope);
    curScope.define(ctx.functionDecl()
        .ID().getText(), udFunc);
    return udFunc;
  }

  @Override
  public PmynType visitAddSub(AddSubContext ctx) {
    switch (ctx.op.getType()) {
      case PmynParser.ADD_OPERATOR: return BuiltInFunction.Add.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      case PmynParser.SUB_OPERATOR: return BuiltInFunction.Sub.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      default: throw new IllegalArgumentException("Illegal type " + ctx.op.getType());
    }
  }

  @Override
  public PmynType visitMulDiv(MulDivContext ctx) {
    switch (ctx.op.getType()) {
      case PmynParser.MUL_OPERATOR: return BuiltInFunction.Multiply.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      case PmynParser.DIV_OPERATOR: return BuiltInFunction.Divide.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      default: throw new IllegalArgumentException("Illegal type " + ctx.op.getType());
    }
  }

  @Override
  public PmynType visitBooleanLiteral(BooleanLiteralContext ctx) {
    switch (ctx.getText()) {
      case "true": return BooleanPmynType.True;
      case "false": return BooleanPmynType.False;
      default: throw new IllegalArgumentException("Not a valid boolean " + ctx.getText());
    }
  }

  @Override
  public PmynType visitExprInsideParens(ExprInsideParensContext ctx) {
    return visit(ctx.expr());
  }
}
