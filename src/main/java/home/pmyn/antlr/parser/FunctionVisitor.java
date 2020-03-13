package home.pmyn.antlr.parser;

import home.pmyn.antlr.PmynParser.FuncBodyContext;
import home.pmyn.antlr.PmynParser.ReturnStatementContext;
import home.pmyn.support.datatype.PmynType;
import home.pmyn.support.datatype.NothingPmynType;
import java.util.Map;

public class FunctionVisitor extends MyVisitor {

  PmynType returnedValue = NothingPmynType.newInstance();

  public FunctionVisitor(Map<String, PmynType> variables) {
    super(variables);
  }

  @Override
  public PmynType visitFuncBody(FuncBodyContext ctx) {
    for (var stat : ctx.stat()) {
      visit(stat);
    }
    return returnedValue;
  }

  @Override
  public PmynType visitReturnStatement(ReturnStatementContext ctx) {
    returnedValue = visit(ctx.expr());
    return returnedValue;
  }
}
