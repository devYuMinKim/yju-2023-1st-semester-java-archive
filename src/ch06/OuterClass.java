package ch06;

public class OuterClass {
  private int value = 10;
  private static int num = 100;

  class InnerClass {
    public void myMethod() {
      System.out.println("외부 클래스의 private 인스턴스 변수 값: " + value);
      System.out.println("외부 클래스의 private 정적 변수 값: " + num);
    }
  }

  OuterClass() {
    InnerClass obj = new InnerClass();
    obj.myMethod();
  }
}
