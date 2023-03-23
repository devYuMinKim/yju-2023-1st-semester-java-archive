package ch06;

public class Television {
  private int channel; // 채널
  private int volume; // 볼륨
  private boolean isOn; // 전원 상태

  // 값 설정
  void setChannel(int channelArg) {
    this.channel = channelArg;
  };

  void setVolume(int volumeArg) {
    this.volume = volumeArg;
  };

  void setIsOn(boolean isOnArg) {
    this.isOn = isOnArg;
  };

  // 맴버 출력
  void print() {
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }

  // 맴버 중 channel의 값 받아오기
  int getChannel() {
    return channel;
  }
}