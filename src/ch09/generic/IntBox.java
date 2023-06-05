package ch09.generic;

public class IntBox {
  // 기초자료형 int의 wrapper class
  private Integer value;

  public Integer getValue() {
    value = 3; // 자동으로 int 값을 Integer 값으로 변환. Auto Boxing
    int v = value; // 자동으로 Integer 값을 int 값으로 변환. Auto Unboxing
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
}
