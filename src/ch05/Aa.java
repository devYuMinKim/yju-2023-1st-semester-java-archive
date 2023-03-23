package ch05;

public class Aa {
  private int x, y;
  private int width, height;

  public Aa(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public Aa(int width, int height) {
    this(0, 0, width, height);
    System.out.println("객체를 생성할 때는 생성자가 제일 먼저 실행되어야함");
  }
}