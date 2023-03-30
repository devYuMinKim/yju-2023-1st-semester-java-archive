package ch07.Shape;

public class ShapeTest2 {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];

    shapes[0] = new Rectangle();
    shapes[1] = new Triangle();
    shapes[2] = new Circle();

    drawShapes(shapes);
    // Rectangle Draw[0, 0]
    // Triangle Draw[0, 0]
    // Circle Draw[0, 0]

    Shape[] shapes1 = new Shape[4];

    shapes1[0] = new Rectangle();
    shapes1[1] = new Triangle();
    shapes1[2] = new Circle();
    shapes1[3] = new Cylinder();

    drawShapes(shapes1);
    // Rectangle Draw[0, 0]
    // Triangle Draw[0, 0]
    // Circle Draw[0, 0]
    // Cylinder Draw[0, 0]
  }

  public static void drawShapes(Shape[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i].draw();
    }
  }
}
