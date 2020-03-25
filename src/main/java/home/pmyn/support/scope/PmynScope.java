package home.pmyn.support.scope;

import home.pmyn.support.datatype.PmynType;

public interface PmynScope {

  PmynScope parent();

  PmynType resolve(String name);

  PmynType define(String name, PmynType value);

  boolean isRoot();
}
