package ch07.Shape;

public class Rectangle extends Shape {
  public Rectangle() {
    super("from Rectangle");
    System.out.println("Rectangle 생성자()");
  }

  public Rectangle(int x, int y, int width, int height) {
    super(x, y);
    System.out.println("Rectangle()");
    this.width = width;
    this.height = height;
  }

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

  // public void draw() {
  // // System.out.println("(" + getX() + ", " + getY() + ") 위치에 " + "가로: " +
  // width +
  // // ", 세로: " + height);
  // System.out.println("(" + x + ", " + y + ") 위치에 " + "가로: " + width + ", 세로: "
  // + height);
  // }

  @Override
  public void draw() { // 추상 메소드 구현
    System.out.println("사각형 그리기 메소드");
  }

  public static void main(String[] args) {
    Rectangle rt = new Rectangle();
  }
}
