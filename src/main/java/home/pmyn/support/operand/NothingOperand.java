package home.pmyn.support.operand;

public class NothingOperand implements Operand {

  private static final NothingOperand operand = new NothingOperand();

  private NothingOperand() {};

  public static NothingOperand newInstance() {
    return operand;
  }
}
