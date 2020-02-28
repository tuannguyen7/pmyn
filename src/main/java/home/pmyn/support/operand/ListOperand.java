package home.pmyn.support.operand;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListOperand implements Operand, Iterable<Operand> {

  private final List<Operand> operands;

  public ListOperand(List<Operand> operands) {
    this.operands = operands;
  }

  @Override
  public Iterator<Operand> iterator() {
    return operands.iterator();
  }

  @Override
  public void forEach(Consumer<? super Operand> action) {
    operands.forEach(action);
  }

  @Override
  public Spliterator<Operand> spliterator() {
    return operands.spliterator();
  }

  @Override
  public String toString() {
    return operands.stream().map(Operand::toString).collect(Collectors.joining(","));
  }

  public List<Operand> getOperands() {
    return operands;
  }
}
