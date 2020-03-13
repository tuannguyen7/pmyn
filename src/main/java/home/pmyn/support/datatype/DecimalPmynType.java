package home.pmyn.support.datatype;

public class DecimalPmynType implements NumberPmynType, Comparable<DecimalPmynType> {

  private final double num;

  public DecimalPmynType(double num) {
    this.num = num;
  }

  public double getNum() {
    return num;
  }

  @Override
  public long integerValue() {
    return (long)num;
  }

  @Override
  public double decimalValue() {
    return num;
  }

  @Override
  public String toString() {
    return num + "";
  }

  @Override
  public int compareTo(DecimalPmynType o) {
    return Double.compare(num, o.getNum());
  }

  @Override
  public Type type() {
    return Type.decimal;
  }
}
