package ch09.interfacetest;

public class Car implements Comparable {
  private String brand;
  private String model;
  private int speed;
  private int price;

  public Car() {
    this("Unknown", "Unknown", 0, 0); // 생성자 호출
  }

  public Car(String brand, String model, int speed, int price) {
    this.brand = brand;
    this.model = model;
    this.speed = speed;
    this.price = price;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getSpeed() {
    return speed;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "[브랜드:" + brand + ", 모델:" + model + ", speed:" + speed + ", price:" + price + "]";
  }

  @Override
  public int compareTo(Comparable obj) {
    // 차의 가격 비교를 하려면, Car 클래스의 getPrice 메소드를 호출해야 되니,
    // 부득이 Comparable 타입으로 받은 인자를 Car 타입으로 하향 형변환.
    // 물론, 이 obj 객체는 Car 클래스 타입의 객체이어야만 하고, 그리 가정한다.
    Car car = (Car) obj; // 타입 캐스팅

    // 내 차 가격과 인자로 전달된 차의 가격을 비교
    if (this.price == car.getPrice())
      return 0;
    else if (this.price > car.getPrice())
      return 1;
    else
      return -1;
  }
}
