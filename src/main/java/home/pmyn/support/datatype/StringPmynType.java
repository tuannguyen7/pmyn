package home.pmyn.support.datatype;

public class StringPmynType implements PmynType {

  private final String value;

  public StringPmynType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }

  @Override
  public Type type() {
    return Type.string;
  }
}
