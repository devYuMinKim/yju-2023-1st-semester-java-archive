package ch05;

public class Box {
  private int width; // 가로
  private int length; // 세로
  private int height; // 높이
  private boolean isSet; // 값 입력 여부 판별기

  // 생성자
  Box() {
    System.out.println();
  }

  // 값 설정
  void setBoxInfo(int widthArg, int lengthArg, int heightArg) {
    // this - 생성된 객체의 주소값
    this.width = widthArg; // 가로
    this.length = lengthArg; // 세로
    this.height = heightArg; // 높이

    // 값 설정 완료
    this.isSet = true;
  }

  void printBoxInfo() {
    String msg; // 출력메시지

    // 멤버 값이 입력된 경우
    if (isSet) {
      msg = String.format("상자의 가로, 세로, 높이는 %d, %d, %d입니다.", width, length, height);
    }
    // 멤버 값이 입력되지 않는 경우
    else {
      msg = "값이 설정되어 있지 않아요. setBoxInfo (width, length, height) 메서드를 사용하여 상자의 가로 세로 높이 값을 입력하세요.";
    }

    // 메시지 출력
    System.out.println(msg);
  };
}
