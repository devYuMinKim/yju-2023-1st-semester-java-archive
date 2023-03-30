package ch07.Shape;

public class Cylinder extends Shape {
  private int radius;
  private int height;

  @Override
  public void draw() {
    System.out.println("Cylinder Draw[" + radius + ", " + height + "]");
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
