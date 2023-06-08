package ch09.generic;

public class GenericTest2 {
  public static void main(String[] args) {
    // GenericPair 클래스 객체 2개 생성해서 값을 넣고 빼고 해보세요.
    GenericPair<Integer, Integer> pair1 = new GenericPair<>(100, 200);
    GenericPair<String, String> pair2 = new GenericPair<>("Hello", "World");

    int val1 = pair1.getKey();
    int val2 = pair1.getValue();
    System.out.println("pair1의 key: " + val1); // pair1의 key: 100
    System.out.println("pair1의 value: " + val2); // pair1의 value: 200

    String str1 = pair2.getKey();
    String str2 = pair2.getValue();
    System.out.println("pair2의 key: " + str1); // pair2의 key: Hello
    System.out.println("pair2의 value: " + str2); // pair2의 value: World

    GenericPair<String, Integer> gp = new GenericPair<String, Integer>("홍길동", 20);
    String key = gp.getKey();
    int val = gp.getValue(); // auto unboxing

    // Generic 클래스의 타입 파라미터 값으로는 반드시 참조형 타입이 와야 한다.
    // 기초자료형(primitive type)은 절대 올 수 없다.
    // GenericPair<String, int> gp2 = new GenericPair<>("고길동", 30); // error
    // 타입 파라미터로 기초자료형의 배열은 올 수 있나?
    int[] jumsus = { 90, 87, 88, 79, 93 };
    GenericPair<String, int[]> gp3 = new GenericPair<String, int[]>("1조 점수", null);

  }
}
