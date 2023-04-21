package ch09.Day;

// 상수를 공유하려면 인터페이스를 구현하면 된다.
public class DayTest implements Days {
  public static void main(String[] args) {
    System.out.println("일요일: " + SUNDAY);
  }
}
