package ch06;

public class Student1 {
  private int number;
  private String name;
  private int age;

  Student1() {
    number = 100;
    name = "New Student";
    age = 19;
  }

  Student1(int number, String name, int age) {
    this.number = number;
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Student [number = " + number + ", name = " + name + ", age = " + age + "]";
  }

  public static void main(String[] args) {
    Student1 std1 = new Student1();
    System.out.println(std1); // Student [number = 100, name = New Student, age = 19]

    Student1 std2 = new Student1(111, "Kim", 24);
    System.out.println(std2); // Student [number = 111, name = Kim, age = 24]
  }
}
