class Animal {
  private double weight;
  private String picture;
  
  protected void eat() {
    System.out.println("eat()가 호출되었음");
  }

  void sleep() {
    System.out.println("sleep()가 호출되었음");
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}

class Lion extends Animal {
  private int legs = 4;

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public void roar() {
    System.out.println("roar()가 호출되었음");
  }
}

class Eagle extends Animal {
  private int wings = 2;

  public int getWings() {
    return wings;
  }

  public void setWings(int wings) {
    this.wings = wings;
  }

  public void fly() {
    System.out.println("fly()가 호출되었음");
  }
}

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