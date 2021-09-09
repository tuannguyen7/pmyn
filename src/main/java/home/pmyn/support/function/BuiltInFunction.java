package home.pmyn.support.function;

import home.pmyn.helper.FunctionHelper;
import home.pmyn.support.datatype.BooleanPmynType;
import home.pmyn.support.datatype.IntegerPmynType;
import home.pmyn.support.datatype.ListPmynType;
import home.pmyn.support.datatype.DecimalPmynType;
import home.pmyn.support.datatype.NumberPmynType;
import home.pmyn.support.datatype.ObjectPmynType;
import home.pmyn.support.datatype.PmynType;
import home.pmyn.support.datatype.NothingPmynType;
import home.pmyn.support.datatype.PmynType.Type;
import home.pmyn.support.datatype.StringPmynType;
import java.awt.desktop.AboutEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuiltInFunction {

  private static final Logger log = LoggerFactory.getLogger(BuiltInFunction.class);

  public static final Function Pow =  params -> {
    if (params.length != 2)
      throw new IllegalArgumentException("Expect 2 parameters but got " + params.length);

    NumberPmynType left = (NumberPmynType) params[0];
    NumberPmynType right = (NumberPmynType)params[1];
    return new DecimalPmynType(Math.pow(left.decimalValue(), right.decimalValue()));
  };

  public static final Function Print = params -> {
    if (params.length != 0) {
      log.debug("call function print with params {}", params[0]);
      System.out.println(params[0].toString());
    }
    return NothingPmynType.newInstance();
  };

  public static final Function Multiply = params -> {
    NumberPmynType[] numberParams = Arrays.stream(params)
        .map(e -> (NumberPmynType)e)
        .toArray(NumberPmynType[]::new);

    double first = numberParams[0].decimalValue();
    double second = numberParams[1].decimalValue();
    double result = first * second;
    Type returnType = FunctionHelper.returnTypeOfNumber(numberParams);
    switch (returnType) {
      case decimal: return new DecimalPmynType(result);
      case integer: return new IntegerPmynType((long)result);
      default: return NothingPmynType.newInstance();
    }
  };

  public static final Function Divide = params -> {
    NumberPmynType[] numberParams = Arrays.stream(params)
        .map(e -> (NumberPmynType)e)
        .toArray(NumberPmynType[]::new);

    double first = numberParams[0].decimalValue();
    double second = numberParams[1].decimalValue();
    double result = first / second;
    Type returnType = FunctionHelper.returnTypeOfNumber(numberParams);
    switch (returnType) {
      case decimal: return new DecimalPmynType(result);
      case integer: return new IntegerPmynType((long)result);
      default: return NothingPmynType.newInstance();
    }
  };

  public static final Function Mod = params -> {
    NumberPmynType[] numberParams = Arrays.stream(params)
        .map(e -> (NumberPmynType)e)
        .toArray(NumberPmynType[]::new);

    long first = numberParams[0].integerValue();
    long second = numberParams[1].integerValue();
    return new IntegerPmynType(first%second);
  };

  public static final Function Add = params -> {
    PmynType first = params[0];
    PmynType second = params[1];

    if (first instanceof NumberPmynType && second instanceof NumberPmynType) {
      double n1 = ((NumberPmynType) first).decimalValue();
      double n2 = ((NumberPmynType) second).decimalValue();
      double result = n1 + n2;
      Type returnType = FunctionHelper.returnTypeOfNumber((NumberPmynType) first, (NumberPmynType) second);
      switch (returnType) {
        case decimal: return new DecimalPmynType(result);
        case integer: return new IntegerPmynType((long)result);
        default: return NothingPmynType.newInstance();
      }
    }

    if (first instanceof StringPmynType) {
      String result = ((StringPmynType) first).getValue() + second.toString();
      return new StringPmynType(result);
    }

    if (first instanceof ListPmynType) {
      ListPmynType lpt = (ListPmynType)first;
      List<PmynType> l = new ArrayList<>();
      l.addAll(lpt.getPmynTypes());
      if (second instanceof ListPmynType) {
        l.addAll(((ListPmynType) second).getPmynTypes());
      } else {
        l.add(second);
      }
      return new ListPmynType(l);
    }

    throw new IllegalArgumentException("Can't add 2 type " + first.getClass().getSimpleName()
        + " and " + second.getClass().getSimpleName());
  };

  public static final Function Sub = params -> {
    NumberPmynType[] numberParams = Arrays.stream(params)
        .map(e -> (NumberPmynType)e)
        .toArray(NumberPmynType[]::new);

    double first = numberParams[0].decimalValue();
    double second = numberParams[1].decimalValue();
    double result = first - second;
    Type returnType = FunctionHelper.returnTypeOfNumber(numberParams);
    switch (returnType) {
      case decimal: return new DecimalPmynType(result);
      case integer: return new IntegerPmynType((long)result);
      default: return NothingPmynType.newInstance();
    }
  };

  public static final Function getAttribute = params -> {
    ObjectPmynType object = (ObjectPmynType)params[0];
    String attributeName = ((StringPmynType)params[1]).getValue();
    return object.getAttribute(attributeName);
  };

  public static final Function CreateObject = params -> {
    if (params.length % 2 != 0)
      throw new IllegalArgumentException("Number of params must be even");

    java.util.Map<String, PmynType> attributes = new HashMap<>();
    for (int i = 0; i < params.length; i += 2) {
      String attributeName = ((StringPmynType)params[i]).getValue();
      attributes.put(attributeName, params[i+1]);
    }
    return new ObjectPmynType(attributes);
  };

  public static final Function Map = params -> {
    Function f = (Function) params[0];
    Iterable<PmynType> iterable = (Iterable)params[1];

    return new
        ListPmynType(
          StreamSupport.stream(iterable.spliterator(), false)
              .map(f::apply)
              .collect(Collectors.toUnmodifiableList()));
  };
}
