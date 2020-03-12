package home.pmyn.support.operand;

import java.util.Map;
import java.util.stream.Collectors;

public class ObjectOperand implements Operand {

  private Map<String, Operand> attribute;

  public ObjectOperand(Map<String, Operand> attribute) {
    this.attribute = attribute;
  }

  public Operand getAttribute(String name) {
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
}
