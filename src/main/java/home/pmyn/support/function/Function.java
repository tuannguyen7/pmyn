package home.pmyn.support.function;

import home.pmyn.support.operand.Operand;

public interface Function extends Operand {

  Operand apply(Operand... params);
}
