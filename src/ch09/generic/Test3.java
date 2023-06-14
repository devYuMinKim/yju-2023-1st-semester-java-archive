package ch09.generic;

import java.util.*;

public class Test3 {
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

    // Collections의 sort 메서드는 List<T> 유형의 객체에 들어있는 원소를 정렬해준다.
    // 단, 그 원소는 Comparable 인터페이스를 구현한 클래스의 객체이어야 한다.
    // Collections.sort(list);

    System.out.println("정렬 후");
    print(list);
  }

  public static void print(List<Student> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println("[" + list.get(i).name + ", " + list.get(i).grade + "]");
    }
    System.out.println();
  }
}
