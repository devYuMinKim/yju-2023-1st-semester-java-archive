package ch07.Lecture.finalclass;

public class FinalTest {
  // 바둑게임관련 클래스라고 가정
  // getFirstPlayer는 바둑에서 첫 번째 돌을 반환한다.
  // 그런데 바둑에서는 첫 번째 돌은 무조건 흑돌이어야 한다.
  // 이런 경우, 이 클래스를 상속받는 하위 클래스에서 절대 이 메서드를 재정의하지 못하도록 종단 메서드로 만들 필요가 있다.
  public final String getFirstPlayer() {
    return "BLACK";
  }
}
