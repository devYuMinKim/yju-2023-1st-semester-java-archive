package ch07.Shape;

public class Circle extends Shape {
  private int radius;

  public void draw() { // 추상 메소드 구현
    System.out.println("원 그리기 메소드");
  }
}
