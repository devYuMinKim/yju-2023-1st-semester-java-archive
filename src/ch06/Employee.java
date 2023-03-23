package ch06;

public class Employee {
  private String name;
  private double salary;

  private static int count = 0; // 정적 변수

  // 생성자
  public Employee(String n, double s) {
    this.name = n;
    this.salary = s;
    count++; // 정적 변수인 count를 증가
  }

  @Override
  protected void finalize() {
    count--; // 직원이 하나 줄어드는 것이므로 count를 하나 감소시킴
  }

  // 정적 메소드
  public static int getCount() {
    return count;
  }
}
