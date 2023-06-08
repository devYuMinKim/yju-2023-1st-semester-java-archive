package ch09.generic;

public class Test {
  public static void main(String[] args) {
    IntBox ib1 = new IntBox();
    ib1.setValue(10);
    System.out.println(ib1.getValue());

    IntBox ib2 = new IntBox();
    ib1.setValue(20);

    int result = ib1.getValue() + ib2.getValue();
    System.out.println(result); // 30

    StrBox sb1 = new StrBox();
    sb1.setValue("동해물과 ");

    StrBox sb2 = new StrBox();
    sb2.setValue("백두산이");

    String result1 = sb1.getValue() + sb2.getValue();
    System.out.println(result1);

    int idx = result1.indexOf("백두산이");
    System.out.println(result1.substring(idx));

    Box b1 = new Box();
    b1.setValue(20);

    Box b2 = new Box();
    b2.setValue(30);

    int result2 = (int) b1.getValue() + (int) b2.getValue(); // 형변환 안하면 에러 발생
    System.out.println(result2);

    Box strBox = new Box();
    strBox.setValue("마르고 닳도록 하느님이 보우하사 우리나라 만세!");
    Object v = strBox.getValue();
    // Object형이기 때문에 그냥 indexOf, substring을 하면 에러 발생
    // int idx1 = strBox.getValue().indexOf("우리나라");
    // System.out.println(strBox.getValue().substring(idx1));
    int idx1 = ((String) v).indexOf("우리나라");
    System.out.println(((String) v).substring(idx1));

    int val = (int) strBox.getValue(); // 현재 상황에서는 에러 발생 X
    System.out.println("프로그램을 종료합니다."); // 실행할 때 45번 라인에서 발생하지 않은 에러가 발생하게 된다. 출력 x
    /* 문제점 */
    /**
     * 1. 값을 빼서 쓸 때 명시적 타입 캐스팅(형변환)을 해야 한다. => 귀찮다. 런타임 오류 발생 가능
     */
  }
}
