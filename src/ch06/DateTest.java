package ch06;

public class DateTest {
  public static void main(String[] args) {
    Date date1 = new Date(2023, "3월", 17);
    Date date2 = new Date(2024);
    Date date3 = new Date();

    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);
  }
}