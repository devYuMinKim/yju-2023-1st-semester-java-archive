package ch09.interfacetest;

// Student 클래스는 Comparable 인터페이스의 모든 메소드를 구현해야 한다.
public class Student implements Comparable {
  private String name;
  private String dept;

  public Student(String string, String string2) {
    this.name = string;
    this.dept = string2;
  }

  public String getName() {
    return name;
  }

  @Override
  public int compareTo(Comparable obj) {
    // null인 경우는 없다고 가정한다.
    // interface는 class처럼 데이터 타입으로 사용될 수 있다.
    // 특정 interface 타입의 변수는 그 interface를 구현하는 모든 클래스의 객체를 담을 수 있다.
    // 모든 클래스(와 그 클래스의 모든 후손 클래스)의 객체를 담을 수 있다.
    Student std = (Student) obj; // 타입 캐스팅

    // String 클래스는 java.lang 패키지의 Comparable 인터페이스를 이미 구현하고 있다.
    // 즉, 그 인터페이스의 추상메소드인 compareTo 메소드를 구현하고 있다.
    // String의 compareTo 메소드는 사전 순서에 따라 비교 대상보다 작으면 음수, 같으면 0, 크면 양수를 반환한다.
    return name.compareTo(std.getName());
  }

}
