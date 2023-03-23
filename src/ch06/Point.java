package ch06;

public class Point {
  private int x;
  private int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "Point [x = " + x + ", y = " + y + "]";
  }
}
