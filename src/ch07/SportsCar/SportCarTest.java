package ch07.SportsCar;

public class SportCarTest {
  public static void main(String[] args) {
    SportCar sc = new SportCar();

    sc.setSpeed(150);
    sc.setTurbo(true);

    sc.toString();
  }
}