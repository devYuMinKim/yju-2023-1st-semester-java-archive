package ch09.interfacetest;

public class CarTest extends StudentTest {
  public static void main(String[] args) {
    Car car1 = new Car("HyunDai", "Grandeur", 250, 5000);
    Car car2 = new Car("GM", "Impala", 300, 4000);
    Car car3 = new Car("HyunDai", "Sonata", 250, 3500);
    Car car4 = new Car("KIA", "K9", 300, 9000);
    Car car5 = new Car("Benz", "E300", 300, 8000);

    System.out.println(car3); // [브랜드:Unknown, 모델:Unknown, speed:0, price:0]

    findLarger(car1, car2);

    // Car가 아니라 상위 클래스인 Object로 하면 안된다.
    // Comparable은 가능.
    Car[] cars = new Car[5];
    cars[0] = car1;
    cars[1] = car2;
    cars[2] = car3;
    cars[3] = car4;
    cars[4] = car5;

    Util.selectionSort(cars);
    for (Car car : (Car[]) cars) {
      System.out.println(car);
    }
  }

  public static void findLarger(Car c1, Car c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다.");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫 번째가 크다.");
    } else {
      System.out.println("두 번째가 크다.");
    }
  }
}
