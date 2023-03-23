package ch06;

public class GameCharacterTest {
  public static void main(String[] args) {
    GameCharacter gcc = new GameCharacter();
    gcc.add("Sword", 1, 100);
    gcc.add("Gun", 2, 50);
    gcc.print();
  }
}
