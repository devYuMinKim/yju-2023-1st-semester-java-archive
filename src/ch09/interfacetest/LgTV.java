package ch09.interfacetest;

public class LgTV implements RemoteControl {
  @Override
  public void turnOn() {
    System.out.println("LG 티비를 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("LG 티비를 끕니다.");
  }
}
