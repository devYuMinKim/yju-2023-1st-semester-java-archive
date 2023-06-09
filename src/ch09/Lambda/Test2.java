import java.time.*;
import java.util.*;
import java.util.function.*;

public class Test2 {
  public static void main(String[] args) {
    /**
     * 1. Person 객체를 5개 이상 생성해 ArrayList에 저장하시오.
     * 2. printGender 메서드를 호출하시오.
     * 가. printGender 메서드는 1번에서 생성한 ArrayList의 각 원소에 대해
     * 그 원소가 남자이면 "ooo은 남자입니다."
     * 그 원소가 여자라면 "ooo은 여자입니다." 를 출력한다.
     */
    Person p1 = new Person("고길동", LocalDate.of(2000, 1, 4), "gdhon@gmail.com", Sex.MALE);
    Person p2 = new Person("일지매", LocalDate.of(1995, 2, 12), "gmil@gmail.com", Sex.FEMALE);
    Person p3 = new Person("박문수", LocalDate.of(1988, 5, 31), "mspark@gmail.com", Sex.MALE);
    Person p4 = new Person("둘리", LocalDate.of(1985, 3, 4), "jhlee@gmail.com", Sex.MALE);
    Person p5 = new Person("엘사", LocalDate.of(2003, 4, 21), "ymkim@gmail.com", Sex.FEMALE);

    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);

    /**
     * CheckPerson 인터페이스 객체를 만드는 방법 3가지
     * 1. 클래스를 정의하고 그 클래스의 객체를 생성
     * 2. 무명클래스로 생성
     * 3. 람다식으로 생성
     */
    // printGender(list, (p) -> p.getGender() == Sex.MALE);
    printPersons(list, (p) -> p.getGender() == Sex.MALE);
    /*
     * 고길동은 남자입니다.
     * 일지매은 여자입니다.
     * 박문수은 남자입니다.
     * 둘리은 남자입니다.
     * 엘사은 여자입니다.
     */
    printPersonsLambda(list, (p) -> p.getGender() == Sex.MALE, (p) -> {
      p.printPerson();
    });
    /*
     * Name: 고길동, Email: gdhon@gmail.com, Gender: MALE, BirthDate: 2000-01-04, Age:
     * 23
     * 
     * Name: 박문수, Email: mspark@gmail.com, Gender: MALE, BirthDate: 1988-05-31, Age:
     * 35
     * 
     * Name: 둘리, Email: jhlee@gmail.com, Gender: MALE, BirthDate: 1985-03-04, Age:
     * 38
     */
  }

  /**
   * Java에서는 유용하게 사용할 수 있는 Functional Interface를 제공하고 있다.
   * Functional Interface는 오직 하나의 추상 메소드를 가지는 제네릭 인터페이스이다.
   * 즉, 이 타입의 객체를 원하는 곳에는 람다식으로 전달할 수 있다.
   */
  public static void printPersons(List<Person> list, Predicate<Person> pred) {
    for (Person p : list) {
      if (pred.test(p)) {
        System.out.println(p.getName() + "은 남자입니다.");
      } else {
        System.out.println(p.getName() + "은 여자입니다.");
      }
    }
  }

  /**
   * interface Predicate<T> {
   * boolean test(T t);
   * }
   * 
   * Predicate<Person>
   * 
   * interface Predicate {
   * boolean test(Person p);
   * }
   * 
   * interface Consumer<T> {
   * void accept(T t);
   * }
   * 
   * Consumer<Person>
   * 
   * interface Consumer {
   * void accept(Person t);
   * }
   */
  public static void printPersonsLambda(List<Person> list, Predicate<Person> pred, Consumer<Person> c) {
    for (Person p : list) {
      if (pred.test(p)) {
        c.accept(p);
        System.out.println();
      }
    }
  }

  // public static void printGender(List<Person> list, CheckGender cp) {
  // for (Person p : list) {
  // if (cp.isMale(p)) {
  // System.out.println(p.getName() + "은 남자입니다.");
  // } else {
  // System.out.println(p.getName() + "은 여자입니다.");
  // }
  // }
  // }

  interface CheckGender {
    boolean isMale(Person p);
  }

  interface CheckPerson {
    boolean test(Person p);
  }
}
