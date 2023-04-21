package ch09.interfacetest;

public class StudentTest {
  public static void main(String[] args) {
    String s1 = "ABC";
    String s2 = "ABD";
    System.out.println(s1.compareTo(s2)); // -1

    Student std1 = new Student("일지매", "컴정");
    Student std2 = new Student("홍길동", "컴정");
    findLarger(std1, std2); // 두 번째가 더 크다.

    Student std3 = new Student("김일곤", "컴정");
    Student std4 = new Student("박수헌", "컴정");
    Student std5 = new Student("안영진", "컴정");

    Student[] stds = new Student[5];
    stds[0] = std1;
    stds[1] = std2;
    stds[2] = std3;
    stds[3] = std4;
    stds[4] = std5;

    Util.selectionSort(stds);

    for (Student std : stds) {
      System.out.println(std.getName());
    }
  }

  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다.");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫 번째가 더 크다.");
    } else {
      System.out.println("두 번째가 더 크다.");
    }
  }
}
