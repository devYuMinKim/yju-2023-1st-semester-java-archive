package ch15.generic;

public class GenericPair<T, V> {
  private T key;
  private V value;

  public GenericPair(T key, V value) {
    this.key = key;
    this.value = value;
  }

  public T getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public void setKey(T key) {
    this.key = key;
  }

  public void setValue(V value) {
    this.value = value;
  }
}
