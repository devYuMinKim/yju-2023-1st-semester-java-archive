package ch09.Rectangle;

public class RectangleTest {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(100, 30);
    Rectangle r2 = new Rectangle(200, 10);

    int result = r1.compareTo(r2);
    if (result == 1)
      System.out.println(r1 + "가 더 큽니다.");
    else if (result == 0)
      System.out.println("같습니다.");
    else
      System.out.println(r2 + "가 더 큽니다.");
  }
}
