package home.pmyn.antlr.parser;


import home.pmyn.antlr.PmynBaseVisitor;
import home.pmyn.antlr.PmynParser;
import home.pmyn.antlr.PmynParser.AndOrLogicContext;
import home.pmyn.antlr.PmynParser.BooleanFalseLiteralContext;
import home.pmyn.antlr.PmynParser.BooleanTrueLiteralContext;
import home.pmyn.antlr.PmynParser.CompilationUnitContext;
import home.pmyn.antlr.PmynParser.DecimalLiteralContext;
import home.pmyn.antlr.PmynParser.EqualityComparisonContext;
import home.pmyn.antlr.PmynParser.ExprInsideParensContext;
import home.pmyn.antlr.PmynParser.ExprStatementContext;
import home.pmyn.antlr.PmynParser.IntegerLiteralContext;
import home.pmyn.antlr.PmynParser.MulDivModContext;
import home.pmyn.antlr.PmynParser.NotExprContext;
import home.pmyn.antlr.PmynParser.PowContext;
import home.pmyn.antlr.PmynParser.PrintStatementContext;
import home.pmyn.antlr.PmynParser.StringLiteralContext;
import home.pmyn.antlr.PmynParser.VarAssignmentStmtContext;
import home.pmyn.antlr.PmynParser.VariableAssignmentStatementContext;
//import home.pmyn.antlr.PmynParser.BlockStmtContext;
//import home.pmyn.antlr.PmynParser.ElseStmtContext;
//import home.pmyn.antlr.PmynParser.ListGetIndexContext;
//import home.pmyn.antlr.PmynParser.IfElseStatementContext;
//import home.pmyn.antlr.PmynParser.IfElseStmtContext;
//import home.pmyn.antlr.PmynParser.ObjectAttributeContext;
//import home.pmyn.antlr.PmynParser.FuncCallContext;
//import home.pmyn.antlr.PmynParser.FuncDefContext;
//import home.pmyn.antlr.PmynParser.ListRefContext;
//import home.pmyn.antlr.PmynParser.ReturnStatementContext;

import home.pmyn.support.datatype.NumberPmynType;
import home.pmyn.support.function.BuiltInFunction;
import home.pmyn.antlr.PmynParser.AddSubContext;
import home.pmyn.antlr.PmynParser.UnaryMinusContext;
import home.pmyn.antlr.PmynParser.VarRefContext;
import home.pmyn.support.datatype.BooleanPmynType;
import home.pmyn.support.datatype.IntegerPmynType;
import home.pmyn.support.datatype.DecimalPmynType;
import home.pmyn.support.datatype.PmynType;
import home.pmyn.support.datatype.StringPmynType;
import home.pmyn.support.scope.DefaultScope;
import home.pmyn.support.scope.GlobalScope;
import home.pmyn.support.scope.PmynScope;
import java.util.ArrayList;
import java.util.List;

import static home.pmyn.helper.MessageFormatHelper.format;
public class DefaultVisitor extends PmynBaseVisitor<PmynType> {

  private final PmynScope curScope;
  private List<VisitorListener> listeners;

  public DefaultVisitor() {
    this.curScope = new DefaultScope(GlobalScope.newInstance());
    this.listeners = new ArrayList<>();
  }

  public DefaultVisitor(PmynScope scope) {
    this.curScope = scope;
    this.listeners = new ArrayList<>();
  }

  public void addListener(VisitorListener listener) {
    this.listeners.add(listener);
  }

  @Override
  public PmynType visitCompilationUnit(CompilationUnitContext ctx) {
    return super.visitCompilationUnit(ctx);
  }

  @Override
  public PmynType visitVarAssignmentStmt(VarAssignmentStmtContext ctx) {
    if (ctx.ASSIGN() == null) {
      return null;
    }

    String variableName = ctx.ID().getText();
    PmynType assignedValue = visit(ctx.expr());
    curScope.define(variableName, assignedValue);
    return assignedValue;
  }

  @Override
  public PmynType visitPrintStatement(PrintStatementContext ctx) {
    PmynType value = visit(ctx.expr());
    System.out.println(value);
    return null;
  }

  @Override
  public PmynType visitExprStatement(ExprStatementContext ctx) {
    PmynType value = visit(ctx.expr());
    exitExpr(value);
    return value;
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
  public PmynType visitUnaryMinus(UnaryMinusContext ctx) {
    PmynType pmynType = visit(ctx.expr());

    if (pmynType instanceof DecimalPmynType) {
      DecimalPmynType casted = (DecimalPmynType) pmynType;
      return new DecimalPmynType(-casted.decimalValue());
    }

    if (pmynType instanceof IntegerPmynType) {
      IntegerPmynType casted = (IntegerPmynType) pmynType;
      return new IntegerPmynType(-casted.integerValue());
    }

    throw new IllegalArgumentException("Bad operand for unary -");
  }

  @Override
  public PmynType visitPow(PowContext ctx) {
    var left = visit(ctx.expr(0));
    var right = visit(ctx.expr(1));
    return BuiltInFunction.Pow.apply(left, right);
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
  public PmynType visitVariableAssignmentStatement(VariableAssignmentStatementContext ctx) {
    return super.visitVariableAssignmentStatement(ctx);
  }

  @Override
  public PmynType visitBooleanTrueLiteral(BooleanTrueLiteralContext ctx) {
    return BooleanPmynType.True;
  }

  @Override
  public PmynType visitBooleanFalseLiteral(BooleanFalseLiteralContext ctx) {
    return BooleanPmynType.False;
  }

  @Override
  public PmynType visitNotExpr(NotExprContext ctx) {
    PmynType bResult = visit(ctx.expr());
    if (bResult instanceof BooleanPmynType) {
      return ((BooleanPmynType) bResult).toggle();
    }
    throw new IllegalArgumentException("Expression " + ctx.expr().getText() + " is not a boolean");
  }

  @Override
  public PmynType visitEqualityComparison(EqualityComparisonContext ctx) {
    PmynType first = visit(ctx.expr(0));
    PmynType second = visit(ctx.expr(1));

    if (!(first instanceof NumberPmynType) || !(second instanceof NumberPmynType))
      throw new IllegalArgumentException(ctx.expr(0).getText() + " and " + ctx.expr(1).getText() + " must be Number");
    double n1 = ((NumberPmynType)first).decimalValue();
    double n2 = ((NumberPmynType)second).decimalValue();

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
  public PmynType visitAddSub(AddSubContext ctx) {
    switch (ctx.op.getType()) {
      case PmynParser.ADD_OPERATOR: return BuiltInFunction.Add.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      case PmynParser.SUB_OPERATOR: return BuiltInFunction.Sub.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      default: throw new IllegalArgumentException("Illegal type " + ctx.op.getType());
    }
  }

  @Override
  public PmynType visitMulDivMod(MulDivModContext ctx) {
    switch (ctx.op.getType()) {
      case PmynParser.MUL_OPERATOR: return BuiltInFunction.Multiply.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      case PmynParser.DIV_OPERATOR: return BuiltInFunction.Divide.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      case PmynParser.MOD_OPERATOR: return BuiltInFunction.Mod.apply(visit(ctx.expr(0)), visit(ctx.expr(1)));
      default: throw new IllegalArgumentException("Illegal type " + ctx.op.getType());
    }
  }

  @Override
  public PmynType visitExprInsideParens(ExprInsideParensContext ctx) {
    return visit(ctx.expr());
  }

  private void exitExpr(PmynType value) {
    for (var l : listeners) {
      l.exitExpr(value);
    }
  }
}
