package ch07.Shape;

import ch07.Shape.Circle;

public class AbstractTest {
  public static void main(String[] args) {
    // Shape shape = new Shape();
    Rectangle rectangle = new Rectangle();
    rectangle.draw(); // 사각형 그리기 메소드

    Circle circle = new Circle();
    circle.draw(); // 원 그리기 메소드
  }
}
