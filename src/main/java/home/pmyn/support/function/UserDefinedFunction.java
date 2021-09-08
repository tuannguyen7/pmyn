package home.pmyn.support.function;

import home.pmyn.antlr.PmynParser.BlockStmtContext;
import home.pmyn.support.datatype.PmynType;
import home.pmyn.antlr.parser.FunctionVisitor;
import home.pmyn.support.scope.PmynScope;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDefinedFunction implements Function {

  private final String funcIdentifier;
  private final List<String> paramIds;
  private final BlockStmtContext funcBodyContext;
  private final PmynScope scope;

  private static final Logger log = LoggerFactory.getLogger(UserDefinedFunction.class);

  public UserDefinedFunction(String funcIdentifier, List<String> paramIds,
      BlockStmtContext funcBodyContext, PmynScope scope) {
    this.funcIdentifier = funcIdentifier;
    this.paramIds = paramIds;
    this.funcBodyContext = funcBodyContext;
    this.scope = scope;
  }

  @Override
  public PmynType apply(PmynType... params) {
    log.debug("Executing function {}", this.funcIdentifier);
    Map<String, PmynType> variables = IntStream.range(0, paramIds.size())
        .boxed()
        .collect(Collectors.toUnmodifiableMap(paramIds::get, index -> params[index]));

    for (var variable : variables.entrySet()) {
      scope.define(variable.getKey(), variable.getValue());
    }

    FunctionVisitor visitor = new FunctionVisitor(scope);
    visitor.visitBlockStmt(funcBodyContext);
    return visitor.getReturnedValue();
  }
}
