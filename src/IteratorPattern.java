import java.util.Arrays;
import java.util.List;

interface Iterator<T> {
  boolean hasNext();
  T next();
}

interface Collection<T> {
  Iterator<T> iterator();
}

class ConcreteIterator<T> implements Iterator<T> {
  private ConcreteCollection<T> collection;
  private int index;

  public ConcreteIterator(ConcreteCollection<T> collection) {
    this.collection = collection;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < collection.size();
  }

  @Override
  public T next() {
    if (hasNext()) {
      return collection.get(index++);
    }
    return null;
  }
}

class ConcreteCollection<T> implements Collection<T> {
  private List<T> list;

  public ConcreteCollection(List<T> list) {
    this.list = list;
  }

  public int size() {
    return list.size();
  }

  public T get(int index) {
    return list.get(index);
  }

  @Override
  public Iterator<T> iterator() {
    return new ConcreteIterator<>(this);
  }
}

public class IteratorPattern {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Collection<Integer> collection = new ConcreteCollection<>(list);
    Iterator<Integer> iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
