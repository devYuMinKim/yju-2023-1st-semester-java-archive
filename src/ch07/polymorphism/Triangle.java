package ch07.polymorphism;

public class Triangle extends Shape {
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

  @Override
  public void draw() {
    // System.out.println("Rectangle Draw[" + getX() + ", " + getY() + "]"); // 이를
    // 통해 부모 클래스 값 접근 가능
    System.out.println("Triangle Draw[" + width + ", " + height + "]");
  }
}
