package ch09.generic;

import java.util.ArrayList;

public class CollectionTest {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("김지훈(4)");
    names.add("김현");
    names.add("이재일");
    names.add("석진석");
    names.add("조현준");
    names.add("김일곤");

    for (String name : names) {
      System.out.println(name);
    }

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(10);
    ages.add(18);
    ages.add(20);
    ages.add(25);
    ages.add(9);

    for (int age : ages) {
      System.out.println(age);
    }
  }
}
