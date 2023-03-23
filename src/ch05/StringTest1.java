package ch05;

public class StringTest1 {
  public static void main(String[] args) {
    String proverb = "A barking dog";
    String s1, s2, s3, s4;

    System.out.println(proverb.length());

    // concat method
    proverb.concat(" never Bites");
    System.out.println(proverb); // "A barking dog" -> String is immutable

    s1 = proverb.concat("never Bites");
    System.out.println(s1);

    // replace method
    proverb.replace("A", "a"); // "A barking dog" -> String is immutable

    s2 = proverb.replace("A", "a");
    System.out.println(s2);

    // substring method
    s3 = proverb.substring(0, 5); // index num -> 0, 1, 2, 3, 4
    System.out.println(s3); // "A barking dog" -> "A bar"

    // toUpperCase
    s4 = proverb.toUpperCase();
    System.out.println(s4);

    int x = 20;
    System.out.println("결과값은 " + x);

    System.out.println("100" + x); // String("10020") -> Operator overloading is only possible with the string data
                                   // type and the '+' operator."
    System.out.println(100 + x); // int(120)

    String s = "1234";
    int n = Integer.parseInt(s); // int(1234)

    double d = Double.parseDouble(s);

    Float.parseFloat(s);

    Long.parseLong(s);
  }
}