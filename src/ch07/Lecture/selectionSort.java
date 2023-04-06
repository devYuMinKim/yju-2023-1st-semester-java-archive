package ch07.Lecture;

public class selectionSort {
  public static void sortList(int[] list) {
    // 입력 받은 배열을 첫 번째 요소부터 접근
    for (int index = 0; index < list.length; index++) {
      // 첫 번째 요소부터 확인 한다
      int min = list[index];
      int newIndex = index;

      for (int i = index + 1; i < list.length; i++) {
        // 최소값의 인덱스
        newIndex = (min > list[i]) ? i : newIndex;
        min = (min > list[i]) ? list[i] : min;
      }
      // 인덱스 바꿔주기
      swap(index, newIndex, list);
    }
  }

  // 인덱스 바꿔주기
  private static void swap(int indexA, int indexB, int[] list) {
    int temp = list[indexA];
    list[indexA] = list[indexB];
    list[indexB] = temp;
  }
}
