package ch07.Bank;

public class ABank extends Bank {
  @Override
  public double getInterestRate() {
    return super.getInterestRate() + 3.0;
  }
}
