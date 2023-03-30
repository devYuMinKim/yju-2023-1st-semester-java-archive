package ch07.Shape;

public class ShapeTest3 {
  public static void main(String[] args) {
    Rectangle rt = new Rectangle();
    Triangle tg = new Triangle();
    Circle cc = new Circle();

    printLocation(rt); // x = 0, y = 0
    printLocation(tg); // x = 0, y = 0
    printLocation(cc); // x = 0, y = 0

    print(rt); // x = 0, y = 0
    print(tg); // x = 0, y = 0
    print(cc); // x = 0, y = 0

    String s = "TEST!!!!";

    print(s); // I can't handle this object!
  }

  public static void printLocation(Shape shape) {
    System.out.println("x = " + shape.getX() + ", y = " + shape.getY());
  }

  public static void print(Object obj) {
    if (obj instanceof Shape) {
      printLocation((Shape) obj);
    } else {
      System.out.println("I can't handle this object!");
    }
  }
}
