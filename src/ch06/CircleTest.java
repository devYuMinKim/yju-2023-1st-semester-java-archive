package ch06;

public class CircleTest {
  public static void main(String[] args) {
    Point p = new Point(25, 78);

    Circle c = new Circle(p, 10);

    System.out.println(c); // Circle [radius = 10, center = Point [x = 25, y = 78]]
  }
}
