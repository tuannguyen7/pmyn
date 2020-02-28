package home.pmyn.support.operator.operand;

public class NothingOperand implements Operand {

  private static final NothingOperand operand = new NothingOperand();

  private NothingOperand() {};

  public static NothingOperand newInstance() {
    return operand;
  }
}
