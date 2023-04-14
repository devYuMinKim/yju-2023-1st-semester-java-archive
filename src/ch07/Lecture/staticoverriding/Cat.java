package ch07.Lecture.staticoverriding;

public class Cat extends Animal {
  // static method는 overriding할 수 없다.
  // @Override // -> 주석 지우면 컴파일 오류 발생. static method는 overriding할 수 없다.
  public static void eat() {
    System.out.println("고양이가 밥을 먹습니다.");
  }

  @Override
  public void sound() {
    System.out.println("Sound of Cat");
  }
}
