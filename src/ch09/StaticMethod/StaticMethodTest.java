package ch09.StaticMethod;

interface MyInterface {
  static void print(String msg) {
    System.out.println(msg + ": 인터페이스의 정적 메소드 호출");
  }
}

public class StaticMethodTest {
  public static void main(String[] args) {
    MyInterface.print("Java 8");
  }
}
