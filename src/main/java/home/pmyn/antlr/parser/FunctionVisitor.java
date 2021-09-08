package home.pmyn.antlr.parser;

//import home.pmyn.antlr.PmynParser.ReturnStatementContext;
import home.pmyn.support.datatype.PmynType;
import home.pmyn.support.datatype.NothingPmynType;
import home.pmyn.support.scope.PmynScope;

public class FunctionVisitor extends DefaultVisitor {

  private PmynType returnedValue = NothingPmynType.newInstance();

  public FunctionVisitor(PmynScope scope) {
    super(scope);
  }

//  @Override
//  public PmynType visitReturnStatement(ReturnStatementContext ctx) {
//    returnedValue = visit(ctx.expr());
//    return returnedValue;
//  }

  public PmynType getReturnedValue() {
    return returnedValue;
  }
}
