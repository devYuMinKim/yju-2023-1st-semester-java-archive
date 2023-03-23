package ch05;

public class CarCounter {
  private String model;
  private String color;
  private int speed;

  // 상수 : 한 번 초기화되면 절대 값을 변경할 수 없는 값
  // 값을 바꾸는 경우가 없음 -> 인스턴스에서 접근 하지 못함 -> static
  // 상수는 대문자로 사용하는 것이 관리
  // 상수는 읽기 전용, 변경할 수 없는 값이라 일반적으로 public 으로 접근 제어
  static public final int MAX_SPEED = 350;
  static public final int MIN_SPEED;

  // 정적 초기화 블록은 static 값을 초기화 해줄 수 있다.
  static {
    MIN_SPEED = 0;
    System.out.println("MIN_SPEED가 초기화 됐습니다.");
  }

  {
    model = "그랜저";
    color = "휜색";
  }

  // 자동차의 시리얼 넘버
  private int id;
  // 정적 멤버로 만들어 모든 인스턴스가 공유할 수 있도록 하자
  static private int numbers = 0;

  // 인스턴스 맴버에 접근하지 않음 -> static
  // 스태틱 메서드는 인스턴스 메서드를 호출할 수 없다 - 인스턴스가 생성되지 않았을 수도 있기 때문
  static public int getNumber() {
    // print()
    return numbers;
  }

  public void print() {
    System.out.println("Hi");
  }

  public CarCounter(String model, String color, int speed) {
    id = ++numbers;
    this.model = model;
    this.color = color;
    this.speed = speed;
  }

  public static void main(String[] args) {
    CarCounter c1, c2, c3;
    c1 = new CarCounter("s600", "white", 80);
    System.out.println(c1.numbers + ", " + c1.id);
    c2 = new CarCounter("s600", "white", 80);
    System.out.println(c2.numbers + ", " + c2.id);
    c3 = new CarCounter("s600", "white", 80);
    System.out.println(c3.numbers + ", " + c3.id);

  }
}