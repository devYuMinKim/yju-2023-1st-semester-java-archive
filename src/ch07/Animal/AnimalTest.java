package ch07.Animal;

public class AnimalTest {
  public static void main(String[] args) {
    Lion lion = new Lion();
    lion.eat();
    lion.sleep();
    lion.roar();

    System.out.println("\n--------------------------------\n");

    Eagle eagle = new Eagle();
    eagle.eat();
    eagle.sleep();
    eagle.sleep();
  }
}