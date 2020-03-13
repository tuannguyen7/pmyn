package home.pmyn.support.datatype;

import java.util.Map;
import java.util.stream.Collectors;

public class ObjectPmynType implements PmynType {

  private Map<String, PmynType> attribute;

  public ObjectPmynType(Map<String, PmynType> attribute) {
    this.attribute = attribute;
  }

  public PmynType getAttribute(String name) {
    if (!attribute.containsKey(name)) {
      throw new IllegalArgumentException("Object has no attribute " + name);
    }
    return attribute.get(name);
  }

  @Override
  public String toString() {
    return attribute.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue().toString())
        .collect(Collectors.joining(",", "{", "}"));
  }

  @Override
  public Type type() {
    return Type.object;
  }
}
