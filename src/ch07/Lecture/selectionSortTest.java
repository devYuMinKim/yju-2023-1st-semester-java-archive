package ch07.Lecture;

import java.util.Random;

public class selectionSortTest {
  public static void main(String[] args) {
    int[] list = new int[10];
    Random random = new Random(System.currentTimeMillis());

    // list에 값 넣어주기
    for (int i = 0; i < list.length; i++) {
      list[i] = random.nextInt(100);
      System.out.print(list[i] + " ");
    }
    System.out.println();

    selectionSort.sortList(list);

    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }

  }
}
