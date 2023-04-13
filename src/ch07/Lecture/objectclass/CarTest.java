package ch07.Lecture.objectclass;

// import 가능
import ch06.Box1;

public class CarTest {
  public static void main(String[] args) {
    Car car = new Car();
    Class classvar = car.getClass();
    // System.out.println(classvar.getName()); // ch07.Lecture.objectclass.Car,
    // {패키지명.클래스명}

    // System.out.println("브랜드: " + car.brand + ", 모델: " + car.model); // 브랜드:
    // Unknown, 모델: Unknown

    Car car1 = new Car("현대", "그랜져");
    Car car2 = new Car("현대", "그랜져");

    // 주소 비교. 내용 비교 x. 오버라이딩 x
    // System.out.println(car1.equals(car1)); // true
    // System.out.println(car1.equals(car2)); // false

    // 내용 비교하도록 오버라이딩한 후
    System.out.println(car1.equals(car1)); // true
    System.out.println(car1.equals(car2)); // true

    // null인 경우
    Car car3 = null;
    System.out.println(car1.equals(car3)); // false

    // Car 인스턴스가 아닌 case
    Box1 box = new Box1(10, 20, 30);
    System.out.println(car1.equals(box)); // false

    System.out.println("프로그램을 종료합니다.");
  }
}
