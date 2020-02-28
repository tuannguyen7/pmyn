package home.pmyn.antlr;

import home.pmyn.antlr.PmynParser.FuncBodyContext;
import home.pmyn.antlr.PmynParser.ReturnStatementContext;
import home.pmyn.antlr.parser.MyVisitor;
import home.pmyn.support.operator.operand.Operand;
import home.pmyn.support.operator.operand.NothingOperand;
import java.util.Map;

public class FunctionVisitor extends MyVisitor {

  Operand returnedValue = NothingOperand.newInstance();

  public FunctionVisitor(Map<String, Operand> variables) {
    super(variables);
  }

  @Override
  public Operand visitFuncBody(FuncBodyContext ctx) {
    for (var stat : ctx.stat()) {
      visit(stat);
    }
    return returnedValue;
  }

  @Override
  public Operand visitReturnStatement(ReturnStatementContext ctx) {
    returnedValue = visit(ctx.expr());
    return returnedValue;
  }
}
