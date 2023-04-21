package ch09.OperateCar;

public class AutoCar implements OperateCar {
  public void start() {
    System.out.println("자동차가 출발합니다.");
  }

  public void stop() {
    System.out.println("자동차가 정지합니다.");
  }

  public void setSpeed(int speed) {
    System.out.println("자동차의 속도를 " + speed + "km/h로 변경합니다.");
  }

  public void turn(int degree) {
    System.out.println("자동차가 " + degree + "도 회전합니다.");
  }
}
