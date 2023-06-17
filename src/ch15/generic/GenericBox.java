package ch15.generic;

/**
 * 어떤 클래스를 제네릭 클래스로 정의하는 것은 클래스 내부에서 사용할 데이터 타입을 미리 정해 놓지 않겠다는 의미이고,
 * 사용자가 이 클래스의 객체를 생성할 때, 어떤 타입을 사용할 지 결정하도록 하겠다는 의미이다.
 * 즉 사용할 데이터 타입을 파라미터로 받겠다. => 타입 파라미터 (Type parameter)
 * 타입 파라미터는 대문자 한글자로 표현하는 것이 관례. 보통 T를 사용.
 */
public class GenericBox<T> {
  T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
