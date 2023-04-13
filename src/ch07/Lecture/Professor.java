package ch07.Lecture;

public class Professor extends Comparable {
  private String name;
  private String proNum;

  public Professor(String name, String proNum) {
    this.name = name;
    this.proNum = proNum;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProNum() {
    return this.proNum;
  }

  public void setProNum(String proNum) {
    this.proNum = proNum;
  }

  @Override
  public String toString() {
    return "[이름: " + name + ", 교번: " + proNum + "]";
  }

  @Override
  public int compareTo(Comparable anotherVal) {
    Professor pro = (Professor) anotherVal; // 하향 형변환
    String proName = pro.getName(); // 이름순
    return name.compareTo(proNum); // 이름순
  }
}
