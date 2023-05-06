package ch09.AnonymousClass;

import ch09.interfacetest.Student;

interface RemoteControl {
  void turnOn();

  void turnOff();
}

public class AnonymousTest {
  public static void main(String[] args) {
    // 무명 클래스로 SonyTV 객체를 만들어 보자.
    RemoteControl rt3 = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("Sony TV를 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("Sony TV를 끕니다.");
      }
    };

    rt3.turnOn();

    // Student 클래스를 상속받는 무명 클래스를 생성하고 이름을 출력해보시오.
    // 무명 클래스를 만들 때(부모클래스의 이름은 인터페이스 이름을 포함),
    // new 부모클래스이름(부모클래스의 생성자에게 전달할 인자 리스트) {클래스 정의}
    // 무명 클래스를 만들 때는 제약이 있는데, 새로운 생성자를 정의할 수 없다. (중요!)
    // class Graduate extends Student { public GraduateStudent(...){...} }

    Student st1 = new Student("대학원생인 홍길동", "컴정") {
      // 무명 클래스는 생성자를 정의할 수 없다.
      // 왜? 생성자는 클래스 이름과 같아야 하는데, 무명 클래스는 클래스 이름이 없다.
      // 그렇다고 부모 클래스 이름으로 생성자를 만들수 도 없다.
      // public Studnet() {} x

      @Override
      public String getName() {
        return "안녕하세요? " + super.getName();
      }
    }; // 무명 클래스 생성하기

    System.out.println("학생의 이름: " + st1.getName());
    System.out.println(st1.getName()); // 부모 클래스의 메소드를 호출할 수 있다.
  }
}
