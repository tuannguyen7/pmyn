package home.pmyn.support.function;

import home.pmyn.support.operand.ListOperand;
import home.pmyn.support.operand.NumberOperand;
import home.pmyn.support.operand.Operand;
import home.pmyn.support.operand.NothingOperand;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class BuiltInFunction {

  public static final Function Pow =  params -> {
    if (params.length != 2)
      throw new IllegalArgumentException("Expect 2 parameters but got " + params.length);
    NumberOperand left = (NumberOperand) params[0];
    NumberOperand right = (NumberOperand)params[1];
    return new NumberOperand(Math.pow(left.getNum(), right.getNum()));
  };

  public static final Function Print = params -> {
    System.out.println(params[0].toString());
    return NothingOperand.newInstance();
  };

  public static final Function Add = params -> {
    double v = 0;
    for (var param : params) {
      v += ((NumberOperand)param).getNum();
    }
    return new NumberOperand(v);
  };

  public static final Function Map = params -> {
    Function f = (Function) params[0];
    Iterable<Operand> iterable = (Iterable)params[1];

    return new
        ListOperand(
          StreamSupport.stream(iterable.spliterator(), false)
              .map(f::apply)
              .collect(Collectors.toUnmodifiableList()));
  };
}
