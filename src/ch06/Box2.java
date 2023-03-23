package ch06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box2 {
  private int width, length, height; // 가로
  private int volume; // 부피

  // 생성자
  Box2(int width, int length, int height) {
    this.width = width;
    this.length = length;
    this.height = height;
  }

  // 박스의 부피 가져오기
  private int getVolume() {
    return width * length * height;
  }

  // 가장 큰 부피를 가지는 박스 인자 리턴
  public static void whoisLargeBox(Box2 argBox1, Box2 argBox2) {

    // List<box>.getName(argBox1, argBox2)
    int argBox1Name = argBox1.getVolume();

    // 입력된 박스의 부피
    int argBox1Volume = argBox1.getVolume();
    int argBox2Volume = argBox2.getVolume();
    System.out.println("argBox1Volume : " + argBox1Volume);
    System.out.println("argBox2Volume : " + argBox2Volume);

    // 부피가 같은 경우
    if (argBox1Volume == argBox2Volume) {
      System.out.println("같은 부피입니다.");
    }
    // 부피가 다른 경우
    else {
      String biggerOne = (argBox1Volume > argBox2Volume) ? "argBox1" : "argBox2";
      System.out.println("더 큰 박스 : " + biggerOne);
    }
  }
}