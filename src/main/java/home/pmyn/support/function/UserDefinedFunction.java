package home.pmyn.support.function;

import home.pmyn.antlr.PmynParser.FuncBodyContext;
import home.pmyn.support.function.Function;
import home.pmyn.support.operator.operand.Operand;
import home.pmyn.antlr.FunctionVisitor;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UserDefinedFunction implements Function {

  private final String funcIdentifier;
  private final List<String> paramIds;
  private final FuncBodyContext funcBodyContext;

  public UserDefinedFunction(String funcIdentifier, List<String> paramIds,
      FuncBodyContext funcBodyContext) {
    this.funcIdentifier = funcIdentifier;
    this.paramIds = paramIds;
    this.funcBodyContext = funcBodyContext;
  }

  @Override
  public Operand apply(Operand... params) {
    Map<String, Operand> variables = IntStream.range(0, paramIds.size())
        .boxed()
        .collect(Collectors.toUnmodifiableMap(paramIds::get, index -> params[index]));

    FunctionVisitor visitor = new FunctionVisitor(variables);
    return visitor.visitFuncBody(funcBodyContext);
  }
}
