package ch06;

public class Test2 {
  int value = 0;

  public void increase(int a) {
    a++;
  }

  public void increase(Test2 obj) {
    obj.value++;
  }

  public static void main(String[] args) {
    Test2 obj = new Test2();
    int x = 10;
    obj.increase(x);
    System.out.println("x = " + x); // x = 10

    System.out.println("obj.value - " + obj.value); // obj.value - 0
    obj.increase(obj);
    System.out.println("obj.value - " + obj.value); // obj.value - 1
  }
}
