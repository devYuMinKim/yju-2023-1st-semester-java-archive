package ch07.Shape;

public class ShapeTest {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();

    r1.setX(5);
    r1.setY(3);
    r1.setWidth(10);
    r1.setHeight(20);

    r2.setX(8);
    r2.setY(9);
    r2.setWidth(15);
    r2.setHeight(20);

    r1.print();
    r1.draw();
    System.out.println("--------------------------------------------------------");
    r2.print();
    r2.draw();

    Shape s = new Rectangle();
    Rectangle r = new Rectangle();

    s.x = 0;
    s.y = 0;
    // s.width = 100; // error
    // s.height = 100; // error

    Shape s1, s2, s3, s4;

    // s1 = new Shape();
    s2 = new Rectangle();
    s3 = new Triangle();
    s4 = new Circle();

    // s1.draw(); // Shape Draw[0, 0]
    s2.draw(); // Rectangle Draw[0, 0]
    s3.draw(); // Triangle Draw[0, 0]
    s4.draw(); // Circle Draw[0]
  }
}
