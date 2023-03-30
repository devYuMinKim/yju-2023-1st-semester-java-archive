package ch07.Bank;

public class BBank extends Bank {
  @Override
  public double getInterestRate() {
    return super.getInterestRate() + 5.0;
  }
}
