package ch09.generic;

import ch09.interfacetest.Student;

public class GenericTest {
  public static void main(String[] args) {
    GenericBox<Integer> box1 = new GenericBox<Integer>();
    box1.setValue(100);
    // box1.setValue("동해물과 백두산이"); -> 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아준다.
    // -> 제네릭을 사용하는 이유
    int val = box1.getValue(); // 명시적인 타입 캐스팅이 필요없다.
    System.out.println("박스에 저장된 값은 [" + val + "] 입니다.");

    GenericBox<String> box2 = new GenericBox<String>();
    box2.setValue("동해물과 백두산이 마르고 닳도록");
    // box2.setValue(100); -> 잘못된 타입의 값을 주면 컴파일 타임 때 그 오류를 잡아준다.
    String sval = box2.getValue(); // 명시적인 타입 캐스팅이 필요없다.
    System.out.println("박스에 저장된 값은 [" + sval + "] 입니다.");

    // 왼쪽에 제네릭 클래스의 적용할 타입이 명시되어 있기 때문에 오른쪽 부분에서 객체 생성할 때는 타입 파라미터를 생략할 수 있다.
    // 아마 JDK 8부터 가능한 것 같다.
    GenericBox<Student> box3 = new GenericBox<Student>();
    Student std = new Student("고길동", "컴정");
    box3.setValue(std);

    Student val3 = box3.getValue();
    System.out.println("박스에 저장된 값은 [" + val3 + "] 입니다.");
  }
}
