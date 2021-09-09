package home.pmyn.helper;

import home.pmyn.support.datatype.NumberPmynType;
import home.pmyn.support.datatype.PmynType.Type;

public class FunctionHelper {

  public static Type returnTypeOfNumber(NumberPmynType... numbers) {
    for (var num : numbers) {
      if (num.type() == Type.decimal)
        return Type.decimal;
    }
    return Type.integer;
  }
}
