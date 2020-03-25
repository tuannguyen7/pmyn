package home.pmyn.support.scope;

import home.pmyn.support.datatype.PmynType;
import home.pmyn.support.function.BuiltInFunction;
import home.pmyn.support.function.Function;
import java.util.Map;

public class GlobalScope implements PmynScope {

  private Map<String, Function> functions = Map.of(
      "pow", BuiltInFunction.Pow,
      "print", BuiltInFunction.Print,
      "map",BuiltInFunction.Map,
      "sub", BuiltInFunction.Sub,
      "object", BuiltInFunction.CreateObject);

  private GlobalScope() {}

  private static final PmynScope scope = new GlobalScope();

  public static PmynScope newInstance() {
    return scope;
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
  public boolean isRoot() {
    return true;
  }
}
