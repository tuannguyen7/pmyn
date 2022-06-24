package home.pmyn.support.scope;

import home.pmyn.support.datatype.PmynType;

public interface PmynScope {

  PmynScope parent();

  /**
   * Resolve given variable, return its value
   * Return null if the variable is not defined
   * */
  PmynType resolve(String name);

  /**
   * Define a variable in current scope
   * Return the variable's value
   * */
  PmynType define(String name, PmynType value);

  /**
   * Return the scope has given variable
   * null if the variable is not defined
   * */
  PmynScope find(String name);

  /**
   * return whether current scope contains given variable
  */
  boolean has(String name);

  /**
  * clear all variables
  */
  void clear();

  boolean isRoot();
}
