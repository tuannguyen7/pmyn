package home.pmyn;


import home.pmyn.support.function.BuiltInFunction;
import home.pmyn.PmynParser.AddSubContext;
import home.pmyn.PmynParser.FuncCallContext;
import home.pmyn.PmynParser.FuncDefContext;
import home.pmyn.PmynParser.FunctionCallContext;
import home.pmyn.PmynParser.ListRefContext;
import home.pmyn.PmynParser.NumRefContext;
import home.pmyn.PmynParser.ReturnStatementContext;
import home.pmyn.PmynParser.StringRefContext;
import home.pmyn.PmynParser.UnaryMinusContext;
import home.pmyn.PmynParser.VarAssginmentContext;
import home.pmyn.PmynParser.VarRefContext;
import home.pmyn.support.function.Function;
import home.pmyn.support.function.UserDefinedFunction;
import home.pmyn.support.operand.ListOperand;
import home.pmyn.support.operand.NumberOperand;
import home.pmyn.support.operand.Operand;
import home.pmyn.support.operand.StringOperand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ParserRuleContext;

public class MyVisitor extends PmynBaseVisitor<Operand> {

  Map<String, Operand> variables = new HashMap<>();
  Map<String, Function> functionMap = Map.of("pow", BuiltInFunction.Pow, "print", BuiltInFunction.Print, "map", BuiltInFunction.Map);
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
  public Operand visitFunctionCall(FunctionCallContext ctx) {
    return visit(ctx.expr());
  }

  @Override
  public Operand visitStringRef(StringRefContext ctx) {
    return new StringOperand(ctx.STRING().getText());
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
  public Operand visitFuncCall(FuncCallContext ctx) {
    Function f = null;
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
      default: throw new IllegalArgumentException("Illegal");
    }
  }
}
