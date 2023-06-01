import java.time.LocalDate;
import java.time.Period;

// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
public class Person {

  private String name;
  private LocalDate birthDate;
  private String emailAddress;
  private Sex gender;

  public Person(
      String name,
      LocalDate birthDate,
      String emailAddress,
      Sex gender) {
    this.name = name;
    this.birthDate = birthDate;
    this.emailAddress = emailAddress;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Sex getGender() {
    return gender;
  }

  public void setGender(Sex gender) {
    this.gender = gender;
  }

  public void printPerson() {
    System.out.println(
        String.format(
            "Name: %s, Email: %s, Gender: %s, BirthDate: %s, Age: %d",
            name,
            emailAddress,
            gender,
            birthDate,
            getAge()));
  }

  public int getAge() {
    // method chaining : 메서드 호출을 쇠사슬이 연결된 것처럼, 이어서 쭉 호출하는 것.
    // 예시: this.getName().substring(1, 2);

    // method chaining 적용 전
    /*
     * Period p = Period.between(birthDate, LocalDate.now());
     * return p.getYears(); // 차를 반환
     */

    // method chaining 적용 후
    return Period.between(birthDate, LocalDate.now()).getYears();
  }
}

// Literal 타입을 정의할 수 있음
/* ts 라면, type keyword와 같다. */
enum Sex {
  MALE,
  FEMALE,
}
