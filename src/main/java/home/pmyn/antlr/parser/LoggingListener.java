package home.pmyn.antlr.parser;

import home.pmyn.support.datatype.NothingPmynType;
import home.pmyn.support.datatype.PmynType;

public class LoggingListener implements VisitorListener {

  @Override
  public void exitExpr(PmynType value) {
    if (value instanceof NothingPmynType) return;
    System.out.println(value);
  }

  @Override
  public void onFailure(PmynType value, Exception e) {

  }
}
