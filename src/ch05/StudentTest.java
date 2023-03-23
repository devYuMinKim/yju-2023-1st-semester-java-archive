package ch05;

public class StudentTest {
  public static void main(String[] args) {
    Student std = new Student();
    std.setName("고길동");
    std.setBirthYear(2002);

    System.out.println(std.getName());
    System.out.println(std.getAge());
  }
}