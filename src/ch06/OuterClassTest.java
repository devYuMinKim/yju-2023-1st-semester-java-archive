package ch06;

public class OuterClassTest {
  public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    System.out.println("--------------------------");
    OuterClass.InnerClass inner = outer.new InnerClass();
    inner.myMethod();
  }
}
