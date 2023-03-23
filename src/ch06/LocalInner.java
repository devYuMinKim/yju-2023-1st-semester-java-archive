package ch06;

public class LocalInner {
  private int data = 30;

  void display() {
    final String msg = "현재의 데이터 값은 ";
    int localVariable = 100;
    localVariable = 200;

    class LocalClass {
      void printMsg() {
        System.out.println(msg + data);
        // System.out.println("localVariable: " + localVariable);
      }
    }

    LocalClass obj = new LocalClass();
    obj.printMsg();
  }

  public static void main(String[] args) {
    LocalInner obj = new LocalInner();
    obj.display();
  }
}
