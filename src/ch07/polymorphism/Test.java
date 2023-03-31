package ch07.polymorphism;

public class Test {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[5];

    shapes[0] = new Shape();
    shapes[0].draw(); // Shape Draw[0, 0]

    shapes[1] = new Rectangle();
    shapes[1].draw(); // Rectangle Draw[0, 0]

    shapes[2] = new Triangle();
    shapes[2].draw(); // Triangle Draw[0, 0]

    shapes[3] = new Circle();
    shapes[3].draw(); // Circle Draw[0]

    shapes[4] = new Polygon();

    drawShapes(shapes);
    /*
     * Shape Draw[0, 0]
     * Rectangle Draw[0, 0]
     * Triangle Draw[0, 0]
     * Circle Draw[0]
     * 다각형을 그립니다.
     */

  }

  public static void drawShapes(Shape[] shapes) {
    for (Shape s : shapes) {
      s.draw();
    }
  }
}
