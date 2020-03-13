package home.pmyn.support.datatype;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListPmynType implements PmynType, Iterable<PmynType> {

  private final List<PmynType> pmynTypes;

  public ListPmynType(List<PmynType> pmynTypes) {
    this.pmynTypes = pmynTypes;
  }

  @Override
  public Iterator<PmynType> iterator() {
    return pmynTypes.iterator();
  }

  @Override
  public void forEach(Consumer<? super PmynType> action) {
    pmynTypes.forEach(action);
  }

  @Override
  public Spliterator<PmynType> spliterator() {
    return pmynTypes.spliterator();
  }

  @Override
  public String toString() {
    return pmynTypes.stream().map(PmynType::toString).collect(Collectors.joining(", ", "[", "]"));
  }

  public List<PmynType> getPmynTypes() {
    return pmynTypes;
  }

  @Override
  public Type type() {
    return Type.list;
  }
}
