package ch09.AnonymousClass;

import ch09.interfacetest.LgTV;
import ch09.interfacetest.SamsungTV;
import ch09.interfacetest.Student;

public class AnonymousClass {
  public static void main(String[] args) {
    RemoteControl rt1 = (RemoteControl) new SamsungTV();
    rt1.turnOn();

    RemoteControl rt2 = (RemoteControl) new LgTV();
    rt2.turnOn();

    // 인터페이스 자료형으로 만든 무명클래스
    RemoteControl rt3 = new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("SONY TV ON");
      }

      @Override
      public void turnOff() {
        System.out.println("SONY TV OFF");
      }
    };

    rt3.turnOn();

    // 문제 Student 클래스를 상속받는 무명 클래스를 생성하고 이름 출력
    Student std1 = new Student("강주원", "AI") {
      // 무명클래스는 이름이 없어 메서드에 직접적인 접근을 하지 못함
      // 따라서 오버라이딩을 이용해 동적바인딩 된 메서드를 사용하게 한다.
      @Override
      public String getName() {
        return super.getName();
      }
    };

    // 무명클래스는 새로운 생성자를 정의할 수 없다
    System.out.println(std1.getName());
  }
}