package ch09.interfacetest;

// 인터페이스의 모든 메서드는 public abstract이다.
public interface RemoteControl {
  void turnOn();

  void turnOff();

  // default 메서드를 구현하면 인터페이스를 구현한 클래스에서 재정의하지 않아도 된다.
  default String volumeControl(int amount) {
    String st = null;
    st = amount > 0 ? "높입니다." : "줄입니다.";
    amount = Math.abs(amount); // 절대값
    return "볼륨을 " + amount + "만큼 " + st;
  };
}
