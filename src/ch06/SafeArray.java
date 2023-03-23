package ch06;

public class SafeArray {
  private int[] a;
  public final int length;

  public SafeArray(int size) {
    a = new int[size];
    length = size;
  }

  public int get(int index) {
    // 0 이상. 배열 a 의 길이보다 작은 값인 경우
    if (index >= 0 && index < a.length)
      return a[index];

    return -1;
  }

  public void put(int index, int value) {
    // 0 이상. 배열 a 의 길이보다 작은 값인 경우
    if (index >= 0 && index < a.length)
      a[index] = value;
    else
      System.out.println("잘못된 인덱스 " + index + "입니다.");
  }
}