package ch06;

public class SafeArrayTest {
  public static void main(String[] args) {
    SafeArray sarr = new SafeArray(3);

    for (int i = 0; i <= sarr.length; i++)
      sarr.put(i, (i + 1) * 10);

    for (int i = 0; i < sarr.length; i++)
      System.out.print("[" + i + "]" + sarr.get(i) + " ");
  }
}
