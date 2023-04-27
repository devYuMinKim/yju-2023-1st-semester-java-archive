package ch09.interfacetest;

public class RemoteControlTest {
  public static void main(String[] args) {
    RemoteControl rm = new SamsungTV();
    rm.turnOn(); // 삼성 티비를 켭니다.
    rm.turnOff(); // 삼성 티비를 끕니다.

    turnOnAndControlVolume(rm, 5); // 삼성 티비를 켭니다. 볼륨을 5만큼 높입니다.

    // if (rm instanceof AdvancedRemoteControl) {
    // ((AdvancedRemoteControl) rm).volumeControls(5); // 볼륨을 5만큼 높입니다.
    // }

    rm = new LgTV();
    rm.turnOn(); // LG 티비를 켭니다.
    rm.turnOff(); // LG 티비를 끕니다.

    System.out.println(rm.volumeControl(3)); // 볼륨을 3만큼 높입니다.
    System.out.println(rm.volumeControl(-1)); // 볼륨을 1만큼 줄입니다.
  }

  public static void turnOnAndControlVolume(RemoteControl rm, int vol) {
    rm.turnOn();
    if (rm instanceof AdvancedRemoteControl) {
      ((AdvancedRemoteControl) rm).volumeControls(vol);
    } else {
      System.out.println("이 기기는 원격 볼륨제어를 지원하지 않습니다.");
    }
  }
}
