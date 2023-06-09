import java.util.*;

public class LambdaTest {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("AAA");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("EEE");

    System.out.println("정렬 전:");
    printList(list);
    /**
     * AAA
     * bbb
     * ccc
     * ddd
     * EEE
     */

    // Collections.sort(list);
    // 입맛대로 sort 방식을 지정하는 것도 가능하다.
    // Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
    Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2)); // 알파벳 대소문자 상관 없이

    System.out.println("정렬 후:");
    printList(list);
    // Collections.sort(list) 결과
    /**
     * AAA
     * EEE
     * bbb
     * ccc
     * ddd
     */

    // Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2)) 결과
    /**
     * AAA
     * bbb
     * ccc
     * ddd
     * EEE
     */
  }

  public static void printList(List<String> list) {
    for (String s : list) {
      System.out.println(s);
    }

    System.out.println(); // 리스트 다 찍고 한 줄 바꾸기 위해서
  }
}
