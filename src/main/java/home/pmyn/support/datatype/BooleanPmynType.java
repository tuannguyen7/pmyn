package home.pmyn.support.datatype;

public class BooleanPmynType implements PmynType {

  private boolean value;
  public static BooleanPmynType True = new BooleanPmynType(true);
  public static BooleanPmynType False = new BooleanPmynType(false);

  public static BooleanPmynType parse(boolean b) {
    if (b)
      return True;
    return False;
  }
  private BooleanPmynType(boolean value) {
    this.value = value;
  }

  public boolean getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value + "";
  }

  @Override
  public Type type() {
    return Type.bool;
  }
}
