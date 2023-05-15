package ch09.AnonymousClass;

import ch09.interfacetest.LgTV;
import ch09.interfacetest.SamsungTV;

public class CallbackTest2 {
  public void remoteControl(RemoteControl rc) {
    rc.turnOn();
  }

  public static void main(String[] args) {
    CallbackTest2 cb = new CallbackTest2();
    // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오.
    // 1. 변수 사용해서 전달해보고
    // 2. 변수 사용하지 않고 전달해보고
    // 화면에는 "파나소닉 테레비가 켜졌습니다."
    // cb.remoteControl(new PanasonicTV());
    cb.remoteControl(new SamsungTV());
    cb.remoteControl(new LgTV());

    cb.remoteControl(new RemoteControl() {
      public void turnOff() {
        System.out.println("No Brand TV를 끕니다.");
      }

      public void turnOn() {
        System.out.println("No Brand TV를 켭니다.");
      }
    });
  }

  private void remoteControl(LgTV lgTV) {
  }

  private void remoteControl(SamsungTV samsungTV) {
  }
}
