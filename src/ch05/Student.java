package ch05;

import java.time.LocalDate;

public class Student {
  private String name;
  private int birthYear;

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthYear(int birthYear) {
    if (birthYear >= 1900) {
      this.birthYear = birthYear;
      return;
    }
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    LocalDate d = LocalDate.now();
    int year = d.getYear();
    return (year - birthYear);
  }
}