package home.pmyn.support.datatype;

public interface PmynType {

  Type type();

  public static enum Type {
    integer, decimal, string, bool, list, nothing, object, function
  }
}
