package ch07.Animal;

public class Animal {
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