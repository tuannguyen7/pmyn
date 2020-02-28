package home.pmyn.support.operand;

public class NumberOperand implements Operand {

  private final double num;

  public NumberOperand(double num) {
    this.num = num;
  }

  public double getNum() {
    return num;
  }

  @Override
  public String toString() {
    return num + "";
  }
}
