package ch06;

import java.util.Scanner;

public class ArrayProc {

    // 값 가져오기
    public void getValues(int[] array) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("성적을 입력하시오: ");
            array[i] = scan.nextInt();
        }
    }

    // 평균
    public double getAverage(int[] array) {
        double total = 0; // 성적 합계

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total / array.length;
    }
}