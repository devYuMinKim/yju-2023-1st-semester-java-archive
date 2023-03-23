package ch05;

public class MyMath {
  // 맴버를 사용하지 않는 메서드 -> 클래스 메서드로 만들어 주기
  static int add(int argX, int argY) {
    return argX + argY;
  }

  static double square(double i) {
    return i * i;
  }
}