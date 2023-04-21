package ch09.interfacetest;

public class Util {

  public static void selectionSort(Comparable[] values) {
    for (int i = 0; i < values.length; i++) {
      int minIdx = i;
      for (int j = i + 1; j < values.length; j++) {
        // 현재까지 찾은 최소값(values[minIdx])과
        // values[j]를 비교해서 values[j]가 더 작으면
        // minIdx를 j로 설정 : minIdx = j
        if (values[minIdx].compareTo(values[j]) > 0) {
          minIdx = j;
        }
      }
      // minIdx의 값과 i의 값을 교환
      swap(i, minIdx, values);
    }
  }

  private static void swap(int idx1, int idx2, Comparable[] values) {
    Comparable tmp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tmp;
  }
}
