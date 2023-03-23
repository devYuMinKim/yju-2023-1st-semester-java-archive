package ch06;

public class Box1Test {
  public static void main(String[] args) {
    Box1 obj1 = new Box1(10, 20, 50);
    Box1 obj2 = new Box1(10, 30, 30);

    Box1 larger = obj1.getLargerBox(obj1, obj2);
    System.out.println("(" + larger.getWidth() + ", " + larger.getLength() + ", " + larger.getHeight() + ")"); // (10,
                                                                                                               // 20,
                                                                                                               // 50)
  }
}
