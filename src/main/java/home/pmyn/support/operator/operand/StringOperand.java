package home.pmyn.support.operator.operand;

public class StringOperand implements Operand {

  private final String value;

  public StringOperand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }
}
