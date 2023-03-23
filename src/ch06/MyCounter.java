package ch06;

public class MyCounter {
  private int counter;

  MyCounter() {
    counter = 1;
  }

  MyCounter(int value) {
    counter = value;
  }

  public void increase() {
    counter++;
  }

  public int getCounter() {
    return counter;
  }

  public static void main(String[] args) {
    MyCounter cntObj1 = new MyCounter();
    MyCounter cntObj2 = new MyCounter();

    cntObj2.increase();

    System.out.println("cntObj1의 counter: " + cntObj1.getCounter()); // cntObj1의 counter: 1
    System.out.println("cntObj2의 counter: " + cntObj2.getCounter()); // cntObj2의 counter: 2

    MyCounter cntObj3 = new MyCounter(100);
    MyCounter cntObj4 = new MyCounter(200);

    System.out.println("cntObj3의 counter: " + cntObj3.getCounter()); // cntObj3의 counter: 100
    System.out.println("cntObj4의 counter: " + cntObj4.getCounter()); // cntObj4의 counter: 200
  }
}
