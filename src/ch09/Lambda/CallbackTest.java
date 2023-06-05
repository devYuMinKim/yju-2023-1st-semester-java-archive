import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.util.Scanner;
import javax.swing.Timer;

public class CallbackTest {
  public static void main(String[] args) {

    // 인터페이스를 구현하는 무명클래스의 경우
    // 생성자에 인자를 넣을 수 없다.
    ActionListener listener = new ActionListener() {
      int num = 1; // 무명이라 멤버에 바로 접근 불가능

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("beep");
      }
    };

    // 첫 번째 인자의 시간을 주기로 두 번째 인자로 입력된 ActionListener 의 actionPerformed 메서드 수행
    // 인자 넣을때 바로 무명클래스 선언할 수 있다
    Timer timer = new Timer(2000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("beep");
      }
    });
    // timer 쓰레드 - 프로세스가 종료해서 실행 안됨
    timer.start();

    // 프로세스가 유지되도록 sleep 메서드 사용 - 1000s
    for (int i = 0; i < 1000; i++) {
      try {
        // 입력되는 인자값의 크기만큼 멈춤
        Thread.sleep(100);
      } catch (InterruptedException e) {
      }
    }

    // // 스캐너 객체를 이용할 수 도 있음
    // Scanner scn = new Scanner(System.in);

    // // 입력을 계속 기다리는 특성을 이용해 프로세스 유지
    // System.out.println("끝내려면 값을 입력하세요");
    // scn.next();
    // System.out.println("끝");
  }
}