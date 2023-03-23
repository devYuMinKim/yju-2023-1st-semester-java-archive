package ch06;

public class TimeTest {
  public static void main(String[] args) {
    Time time1 = new Time();
    System.out.println("매개변수가 없는 생성자 호출 후 시간: " + time1); // 매개변수가 없는 생성자 호출 후 시간: 00:00:00

    Time time2 = new Time(13, 27, 6);
    System.out.println("두 번째 생성자 호출 후 시간: " + time2); // 두 번째 생성자 호출 후 시간: 13:27:06

    Time time3 = new Time(99, 66, 77);
    System.out.println("올바르지 않은 시간 설정 후 시간: " + time3); // 올바르지 않은 시간 설정 후 시간: 00:00:00
  }
}
