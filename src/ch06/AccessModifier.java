package ch06;

public class AccessModifier {
  private int privateVariable;
  int defaultVariable;
  protected int protectedVariable;
  public int publicVariable;

  public void print() {
    System.out.println("privateVariable: " + privateVariable);
    System.out.println("defaultVariable: " + defaultVariable);
    System.out.println("protectedVariable: " + protectedVariable);
    System.out.println("publicVariable: " + publicVariable);
  }
}