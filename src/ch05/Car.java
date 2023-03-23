package ch05;

public class Car {
  private int SPEED_LIMIT = 10; // 기어 1단 - 10, 2단 - 20 ... n단 - 10n
  private int MAX_SPEED = 80; // 최고 속도

  private String color; // 색상
  private int speed; // 속도
  private int gear; // 기어

  // static {
  // MAX_SPEED = 350;
  // System.out.println("MAX_SPEED가 초기화되었습니다.");
  // }

  {
    System.out.println("차를 만들었어요");
    speed = 0;
    gear = 0;
  }

  Car() {
    // 기본값
    this("black", 0, 0);
  }

  Car(String color, int speed, int gear) {
    this.color = color;
  }

  // 차 색상 바꾸기
  void changeColor(String color) {
    this.color = color;
  }

  // 색 설정
  void setColor(String colorArg) {
    this.color = colorArg;
  };

  // 가속
  void speedUp() {
    speed++;

    // 기어 변속 하지 않고 버틸 수 있는 최대속도
    int maxSpeed = gear * SPEED_LIMIT;

    // 기어 변경
    if (speed == maxSpeed) {
      this.gear++;
      System.out.println("기어 변경 " + gear);
    }

    // 최고속도
    if (speed == MAX_SPEED) {
      System.out.println("최고 속도에요");
    }
  };

  // 감속
  void speedDown() {
    // 속도가 0인 경우
    if (speed == 0) {
      System.out.println("정지");
    }

    speed--;

    // 기어 변속 하지 않고 버틸 수 있는 최소속도
    int minSpeed = gear * SPEED_LIMIT;

    // 기어 변경
    if (speed == minSpeed) {
      this.gear--;
      System.out.println("기어 변경 " + gear);
    }
  };

  // toString 을 오버라이딩하여 해당 클래스의 맴버에 접근
  @Override
  public String toString() {
    return String.format("Car [color= %s, speed= %d, gear= %d]", color, speed, gear);
  };
}