package ch06;

public class Circle {
  private Point p;
  private int radius;

  public Circle(Point p, int radius) {
    this.p = p;
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "기준점 : " + p + ", 반지름 : " + radius;
  }

  public static void main(String[] args) {
    Point p = new Point(10, 15);
    Circle c = new Circle(p, 10);

    System.out.println(p); // 다형성 - 부모의 형으로 자식 클래스 접근 가능
    System.out.println(p.toString()); // root - Object

    System.out.println(c); // 다형성 - 부모의 형으로 자식 클래스 접근 가능
    System.out.println(c.toString()); // root - Object
  }
}