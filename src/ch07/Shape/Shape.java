package ch07.Shape;

public abstract class Shape {
  public Shape() {
    System.out.println("Shape 생성자()");
  }

  public Shape(String msg) {
    System.out.println("Shape 생성자(msg)" + msg);
  }

  public Shape(int x, int y) {
    System.out.println("Shape()");
    this.x = x;
    this.y = y;
  }

  int x;
  int y;

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

  public abstract void draw();
}