package ch07.Lecture;

public class Test3 {
  public static void main(String[] args) {
    Student[] stds = new Student[5];
    stds[0] = new Student("석진석", "2201363");
    stds[1] = new Student("이재일", "2201392");
    stds[2] = new Student("김일곤", "2201330");
    stds[3] = new Student("최진수", "1801295");
    stds[4] = new Student("조현준", "1901276");

    Util.selectionSort(stds); // 정렬

    for (Student std : stds) {
      System.out.println(std); // toString() 호출 안해도 됨
      /*
       * [이름: 김일곤, 학번: 2201330]
       * [이름: 석진석, 학번: 2201363]
       * [이름: 이재일, 학번: 2201392]
       * [이름: 조현준, 학번: 1901276]
       * [이름: 최진수, 학번: 1801295]
       */
    }
  }
}
