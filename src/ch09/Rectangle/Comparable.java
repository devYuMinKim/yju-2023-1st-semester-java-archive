package ch09.Rectangle;

public interface Comparable { // 실제로는 제네릭을 사용해서 정의된다.
  // 이 객체가 다른 객체보다 크면 1, 같으면 0, 작으면 -1을 반환한다.
  int compareTo(Object other); // -1, 0, 1 반환
}
