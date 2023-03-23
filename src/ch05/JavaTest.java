package ch05;

public class JavaTest {
  // instance variable
  private String name;

  // instance method
  String getName() {
    return name;
  }

  // static method
  static void sayHello() {
    System.out.println("HI!!!!!!!!");
  }

  void setName(String name) {
    this.name = name;
  }

  // member method
  // instance method
  double square(double df) {
    test();
    return df * df;
  }

  int square(int num) {
    return num * num;
  }

  void test() {
    System.out.println("test method called");
  }

  public static void main(String[] args) {
    // JavaTest t = new JavaTest(); // instantiation

    // t.name="HongGilDong";
    // t.setName("홍길동");
    // System.out.println(t.name);

    // JavaTest t2 = new JavaTest();
    // t2.name="T2";
    // System.out.println(t2.name);

    // System.out.println("hello world");
    // double r = square(4.0);

    // if (args.length==0) {
    // System.out.println("Usage: java JavaTest name");
    // return;
    // } else {
    // System.out.println("Hello " + args[0]);
    // }
    // JavaTest jt = new JavaTest();
    // int result = jt.square(3);
    // System.out.println(result);

    // double result2 = jt.square(3.14);
    // System.out.println(result2);
    // System.out.println("String....");
    // System.out.println(4);
    // System.out.println(true);
    // System.out.println(8.678);

    JavaTest.sayHello();
    // JavaTest t = new JavaTest();
    // t.sayHello();
  }
}