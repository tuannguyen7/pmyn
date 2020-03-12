package home.pmyn.support.operand;

public class BooleanOperand implements Operand {

  private boolean value;
  public static BooleanOperand True = new BooleanOperand(true);
  public static BooleanOperand False = new BooleanOperand(false);

  public static BooleanOperand parse(boolean b) {
    if (b)
      return True;
    return False;
  }
  private BooleanOperand(boolean value) {
    this.value = value;
  }

  public boolean getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value + "";
  }
}
