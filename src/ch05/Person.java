package ch05;

public class Person {
  /*
   * 맴버 변수는 특별한 이유가 없는한 private로 만들어라.
   * 그 멤버 변수를 클래스 외부에서 접근해야 한다면 그를 위한 method를 public으로 구현해라.
   * 예를 들어, myAge라는 맴버 변수에 값을 설정해야 하는 메소드는 set Age로, myAge라는 맴버 변수에 값을 읽어오는 메서드는
   * getAge로 public 접근제어지정자를 명시하여 구현하면 된다.
   * 이렇게 함으로써 맴버 변수에 잘못된 값이 설정되는 것을 막을 수도 있고 향후에 그 클래스를 버전업 하면서 맴버 변수의 이름을 변경해도 그
   * 클래스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.
   */

  /*
   * 접근제어자
   * public, protected, default, private
   * private가 명시된 멤버는 그 클래스 내부에서만 접근 가능
   * protected가 명시된 멤버는 동일한 패키지의 클래스나 해당 클래스를 상속받은 클래스에서만 접근가능
   * default가 명시된 멤버는 동일한 패키지내부 클래스만 접근가능
   * public이 명시된 멤버는 어느곳에서든 접근 가능
   */

  private String name;
  private int age;
  String dept = "컴정";

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public void setAge(int age) {
    if (age >= 0 && age <= 150)
      this.age = age;
    else
      System.out.println("나이의 범위는 0부터 150까지입니다.");
  }

  public int getAge() {
    return age;
  }

  private void test() {
    System.out.println(name);
  }
}