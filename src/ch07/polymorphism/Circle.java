package ch07.polymorphism;

public class Circle extends Shape {
  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    // System.out.println("Rectangle Draw[" + getX() + ", " + getY() + "]"); // 이를
    // 통해 부모 클래스 값 접근 가능
    System.out.println("Circle Draw[" + radius + "]");
  }
}
