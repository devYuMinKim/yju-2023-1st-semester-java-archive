package ch09.Lambda;

public class Test {
  public void test(MyInterface m1) {
    m1.print("Hello World");
  }

  public static void main(String[] args) {
    Test t = new Test();
    // 1. 무명 클래스를 이용해 Test 클래스의 인스턴스 메소드 test 호출하시오.
    t.test(new MyInterface() {
      public void print(String s) {
        System.out.println(s);
      }
    });
    // 2. 람다를 이용해 Test 클래스의 인스턴스 메소드 test 호출하시오.
    // 인터페이스인데 오직 하나의 추상 메소드를 가지는 인터페이스는 람다로 구현할 수 있다.
    t.test((String s) -> {
      System.out.println(s);
    });
  }
}
