package ch05;

public class PersonTest {

  public static void main(String[] args) {
    Person personT = new Person();
    personT.setAge(20);
    String d = personT.dept;
    int age = personT.getAge();

    System.out.println(age);
    System.out.println(d);
  }
}