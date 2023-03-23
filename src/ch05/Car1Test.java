package ch05;

public class Car1Test {
  public static void main(String[] args) {
    Car1 c1 = new Car1("S600", "white", 150);
    Car1 c2 = new Car1("E500", "blue", 120);

    System.out.println("지금까지 생산된 자동차 수 = " + Car1.numbers); // 지금까지 생산된 자동차 수 = 2

    Car1 c3 = new Car1("V230", "black", 130);

    System.out.println("지금까지 생산된 자동차 수 = " + Car1.getNumbers()); // 지금까지 생산된 자동차 수 = 3
    System.out.println("Car3 id: " + c3.getId());
  }
}
