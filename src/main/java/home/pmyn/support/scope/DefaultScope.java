package home.pmyn.support.scope;

import home.pmyn.support.datatype.PmynType;
import java.util.HashMap;
import java.util.Map;

public class DefaultScope implements PmynScope {

  private final PmynScope parent;

  private final Map<String, PmynType> variables;

  public DefaultScope(PmynScope parent,
      Map<String, PmynType> variables) {
    this.parent = parent;
    this.variables = new HashMap<>();
    this.variables.putAll(variables);
  }

  public DefaultScope(PmynScope parent) {
    this.parent = parent;
    this.variables = new HashMap<>();
  }

  @Override
  public PmynScope parent() {
    return parent;
  }

  @Override
  public PmynType resolve(String name) {
    if (variables.containsKey(name))
      return variables.get(name);
    return parent.resolve(name);
  }

  @Override
  public PmynType define(String name, PmynType value) {
    return variables.put(name, value);
  }

  @Override
  public PmynScope find(String name) {
    if (has(name)) {
      return this;
    }

    if (parent == null) {
      return null;
    }

    return parent.find(name);
  }

  @Override
  public boolean has(String name) {
    return variables != null && variables.containsKey(name);
  }

  @Override
  public void clear() {
    variables.clear();
  }

  @Override
  public boolean isRoot() {
    return parent() != null;
  }
}
