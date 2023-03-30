package ch07.Bank;

public class BankTest {
  public static void main(String[] args) {
    ABank a = new ABank();
    BBank b = new BBank();
    CBank c = new CBank();

    System.out.println("A Bank의 이자율: " + a.getInterestRate()); // A Bank의 이자율: 3.0
    System.out.println("B Bank의 이자율: " + b.getInterestRate()); // B Bank의 이자율: 5.0
    System.out.println("C Bank의 이자율: " + c.getInterestRate()); // C Bank의 이자율: 10.0
  }
}
