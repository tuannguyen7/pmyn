package home.pmyn.support.scope;

import home.pmyn.support.datatype.PmynType;
import home.pmyn.support.function.BuiltInFunction;
import home.pmyn.support.function.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GlobalScope implements PmynScope {

  private Map<String, Function> functions = Map.of(
      "pow", BuiltInFunction.Pow,
      "print", BuiltInFunction.Print,
      "map",BuiltInFunction.Map,
      "sub", BuiltInFunction.Sub,
      "object", BuiltInFunction.CreateObject);
  private List<String> outputHub;
  private boolean testEnable = false;

  private GlobalScope() {}

  private static final PmynScope scope = new GlobalScope();

  public static PmynScope newInstance() {
    return scope;
  }

  public PmynScope enableTest(List<String> outputHub) {
    this.testEnable = true;
    this.outputHub = outputHub;
    return this;
  }

  @Override
  public PmynScope parent() {
    return null;
  }

  @Override
  public PmynType resolve(String name) {
    return functions.get(name);
  }

  @Override
  public PmynType define(String name, PmynType value) {
    throw new IllegalArgumentException("Immutable scope NOT supported add arguments");
  }

  @Override
  public PmynScope find(String name) {
    if (has(name)) return this;
    return null;
  }

  @Override
  public boolean has(String name) {
    return functions.containsKey(name);
  }

  @Override
  public void clear() {
    throw new IllegalArgumentException("Can't clear Global scope");
  }

  @Override
  public boolean isRoot() {
    return true;
  }
}
