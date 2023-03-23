package ch05;

public class Test {
  public static void main(String[] args) {
    JavaTest t1 = new JavaTest();
    t1.setName("HongGilDong");
    System.out.println(t1.getName()); // HongGilDong
    // String.charAt(0);

    String s1 = "동해물과 백두산이"; // new String("동해물과 백두산이");
    String s2 = "동해물과 백두산이";
    char c = s1.charAt(5);
    System.out.println(c); // 백

    boolean r = s1 == s2;
    System.out.println(r); // true

    String s3 = new String("동해물과 백두산이");
    r = s1 == s3;
    System.out.println(r); // false

    r = s3.equals(s1);
    System.out.println(r); // true

    s1 = new String("i love you");
    s2 = new String("i love you");

    r = s1.equalsIgnoreCase(s2);
    System.out.println(r); // true
  }
}