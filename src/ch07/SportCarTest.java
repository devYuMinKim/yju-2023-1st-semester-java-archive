class Car {
  private int speed;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String toString() {
    return null;
  }
}

class SportCar extends Car {
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

public class SportCarTest {
  public static void main(String[] args) {
    SportCar sc = new SportCar();
    
    sc.setSpeed(150);
    sc.setTurbo(true);

    sc.toString();
  }
}