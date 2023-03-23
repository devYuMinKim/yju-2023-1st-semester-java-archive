class Shape {
  private int x;
  private int y;
  
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void print() {
    System.out.println("X좌표: " + x + " Y좌표: " + y);
  }
}

class Rectangle extends Shape {
  private int width;
  private int height;

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int area() {
    return width * height;
  }

  public void draw() {
    System.out.println("(" + getX() + ", " + getY() + ") 위치에 " + "가로: " + width + ", 세로: " + height);
  }
}

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
  }
}
