package home.pmyn.support.datatype;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StringPmynType implements PmynType, Iterable<StringPmynType> {

  private final String value;

  public StringPmynType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }

  @Override
  public Type type() {
    return Type.string;
  }

  @Override
  public Iterator<StringPmynType> iterator() {
    return Arrays.asList(value).stream().map(StringPmynType::new).iterator();
  }

  @Override
  public void forEach(Consumer<? super StringPmynType> action) {
  }

  @Override
  public Spliterator<StringPmynType> spliterator() {
    return Arrays.asList(value).stream().map(StringPmynType::new).spliterator();
  }
}
