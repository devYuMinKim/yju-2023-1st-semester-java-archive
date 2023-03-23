package ch05;

public class Car1 {
  private String model;
  private String color;
  private int speed;

  private int id; // 자동차의 시리얼 넘버
  static int numbers = 0; // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자.

  public Car1() {
    id = ++numbers;
  }

  // Constructor, 가급적 public을 붙이자.
  public Car1(String m, String c, int s) {
    this();
    model = m;
    color = c;
    speed = s;
  }

  // static method가 맞나? instance method로 구현하는 것이 맞나? : static
  // static method는 instance method를 호출할 수 있다 없다? : 없다.
  // static method는 Class와 연관되어 있기 때문에 Instance가 생성되지 않아도 사용할 수 있어야 한다.
  public static int getNumbers() {
    return numbers;
  }

  public int getId() {
    return id;
  }
}
