package ch05;

public class CarTest {
  public static void main(String[] args) {
    // 객체 생성
    Car car = new Car();

    // 색상 설정
    // car.setColor("green");

    // 가속
    for (int i = 0; i < 80; i += 5) {
      car.speedUp();
    }

    // 차의 상태 출력
    System.out.println(car);

    // 감속
    for (int i = 0; i < 100; i += 5) {
      car.speedDown();
    }
  }
}