package ch07.SportsCar;

public class SportCar extends Car {
  private boolean turbo;

  public boolean isTurbo() {
    return turbo;
  }

  public void setTurbo(boolean turbo) {
    this.turbo = turbo;
  }

  @Override
  public String toString() {
    return "";
  }
}
