package home.pmyn.support.datatype;

public class NothingPmynType implements PmynType {

  private static final NothingPmynType operand = new NothingPmynType();

  private NothingPmynType() {};

  public static NothingPmynType newInstance() {
    return operand;
  }

  @Override
  public Type type() {
    return Type.nothing;
  }
}
