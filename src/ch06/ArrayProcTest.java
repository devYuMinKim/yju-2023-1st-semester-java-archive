package ch06;

public class ArrayProcTest {
    final static int STUDENTS = 5;

    public static void main(String[] args) {
        int[] scores = new int[STUDENTS];

        // instance 생성
        ArrayProc obj = new ArrayProc();

        // 객체 내용 변경
        obj.getValues(scores);

        // 출력
        System.out.println("평균은 = " + obj.getAverage(scores));
    }
}