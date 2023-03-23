package ch06;

public class TelevisionTest {
  public static void main(String[] args) {

    // 객체 생성
    Television Tv0 = new Television();

    // 맴버 값 설정
    Tv0.setChannel(7);
    Tv0.setVolume(9);
    Tv0.setIsOn(true);

    // 맴버 접근
    Tv0.print(); // 채널은 7이고 볼륨은 9입니다.

    // 맴버 값 가져오기
    int ch = Tv0.getChannel();
    System.out.println("현재 채널은 " + ch + "입니다."); // 현재 채널은 7입니다.
  }
}