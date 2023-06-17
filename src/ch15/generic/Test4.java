package ch15.generic;

import java.util.*;

public class Test4 {
  public static void main(String[] args) {
    Student std1 = new Student("고길동", 77);
    Student std2 = new Student("홍길동", 87);
    Student std3 = new Student("김길동", 97);
    Student std4 = new Student("박길동", 79);
    Student std5 = new Student("이길동", 88);

    List<Student> list = new ArrayList<>();
    list.add(std1);
    list.add(std2);
    list.add(std3);
    list.add(std4);
    list.add(std5);

    System.out.println("정렬 전");
    print(list);

    System.out.println("정렬 후");
    Collections.sort(list, new MyComparator());
    print(list);

    Collections.sort(list, new Comparator<Student>() {
      public int compare(Student s1, Student s2) {
        return -(s1.grade - s2.grade); // 역순
      }
    });

    // 람다로 역순 구현
    Collections.sort(list, (s1, s2) -> -(s1.grade - s2.grade));

    print(list);
  }

  public static void print(List<Student> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println("[" + list.get(i).name + ", " + list.get(i).grade + "]");
    }
    System.out.println();
  }
}

class MyComparator implements Comparator<Student> {
  @Override
  public int compare(Student o1, Student o2) {
    return o1.grade - o2.grade;
  }
}