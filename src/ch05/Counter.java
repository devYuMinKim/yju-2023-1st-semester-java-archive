package ch05;

public class Counter {
  private int value;

  public void setValue(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public static void addOne(int val) {
    val = val + 1;
  }

  public static void increase(Counter cntObj) {
    // System.out.println(this); // 인스턴스 매서드의 인스턴스 주소값
    System.out.println(cntObj); // 인자값으로 들어온 객체의 주소값 -> 인스턴스의 맴버에 접근하지 않음 -> static 메서드로 쓰는 것이 합당함.
    int v = cntObj.getValue() + 1;
    cntObj.setValue(v);
  }

  public static void main(String[] jvmRun) {
    Counter mc = new Counter();
    mc.setValue(10);
    Counter.increase(mc);
    System.out.println(mc.getValue());
  }
}