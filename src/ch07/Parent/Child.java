package ch07.Parent;

public class Child extends Parent {
  public void print() {
    super.print();
    System.out.println("자식 클래스의 print() 메소드");
  }

  public static void main(String[] args) {
    Child child = new Child();
    child.print();
    // 부모 클래스의 print() 메소드
    // 자식 클래스의 print() 메소드
  }
}
