package home.pmyn.support.function;

import home.pmyn.support.operand.ListOperand;
import home.pmyn.support.operand.NumberOperand;
import home.pmyn.support.operand.ObjectOperand;
import home.pmyn.support.operand.Operand;
import home.pmyn.support.operand.NothingOperand;
import home.pmyn.support.operand.StringOperand;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuiltInFunction {

  private static final Logger log = LoggerFactory.getLogger(BuiltInFunction.class);

  public static final Function Pow =  params -> {
    if (params.length != 2)
      throw new IllegalArgumentException("Expect 2 parameters but got " + params.length);
    NumberOperand left = (NumberOperand) params[0];
    NumberOperand right = (NumberOperand)params[1];
    return new NumberOperand(Math.pow(left.getNum(), right.getNum()));
  };

  public static final Function Print = params -> {
    log.debug("call function print with params {}", params);
    System.out.println(params[0].toString());
    return NothingOperand.newInstance();
  };

  public static final Function Multiply = params -> {
    double first = ((NumberOperand)params[0]).getNum();
    double second = ((NumberOperand)params[1]).getNum();
    return new NumberOperand(first*second);
  };

  public static final Function Divide = params -> {
    double first = ((NumberOperand)params[0]).getNum();
    double second = ((NumberOperand)params[1]).getNum();
    return new NumberOperand(first/second);
  };

  public static final Function Add = params -> {
    double first = ((NumberOperand)params[0]).getNum();
    double second = ((NumberOperand)params[1]).getNum();
    return new NumberOperand(first - second);
  };

  public static final Function Sub = params -> {
    double first = ((NumberOperand)params[0]).getNum();
    double second = ((NumberOperand)params[1]).getNum();
    return new NumberOperand(first - second);
  };

  public static final Function getAttribute = params -> {
    ObjectOperand object = (ObjectOperand)params[0];
    String attributeName = ((StringOperand)params[1]).getValue();
    return object.getAttribute(attributeName);
  };

  public static final Function CreateObject = params -> {
    if (params.length % 2 != 0)
      throw new IllegalArgumentException("Number of params must be even");

    java.util.Map<String, Operand> attributes = new HashMap<>();
    for (int i = 0; i < params.length; i += 2) {
      String attributeName = ((StringOperand)params[i]).getValue();
      attributes.put(attributeName, params[i+1]);
    }
    return new ObjectOperand(attributes);
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
