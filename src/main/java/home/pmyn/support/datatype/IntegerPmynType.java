package home.pmyn.support.datatype;

public class IntegerPmynType implements NumberPmynType, Comparable<IntegerPmynType> {

  private final long num;

  public IntegerPmynType(long num) {
    this.num = num;
  }

  public long getNum() {
    return num;
  }

  @Override
  public String toString() {
    return num + "";
  }

  @Override
  public long integerValue() {
    return num;
  }

  @Override
  public double decimalValue() {
    return (double)num;
  }

  @Override
  public int compareTo(IntegerPmynType o) {
    return Long.compare(num, o.getNum());
  }

  @Override
  public Type type() {
    return Type.integer;
  }
}
