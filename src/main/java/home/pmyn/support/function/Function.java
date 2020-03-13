package home.pmyn.support.function;

import home.pmyn.support.datatype.PmynType;

public interface Function extends PmynType {

  PmynType apply(PmynType... params);

  public default Type type() {
    return Type.function;
  }
}
