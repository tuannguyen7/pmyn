package home.pmyn.antlr.parser;

import home.pmyn.support.datatype.PmynType;

public interface VisitorListener {

  void exitExpr(PmynType value);
  void onFailure(PmynType value, Exception e);
}
