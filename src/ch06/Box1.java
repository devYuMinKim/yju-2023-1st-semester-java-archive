package ch06;

public class Box1 {
  private int width;
  private int length;
  private int height;
  private int volume;

  public int getVolume() {
    volume = width * length * height;

    return volume;
  }

  Box1(int w, int l, int h) {
    this.width = w;
    this.length = l;
    this.height = h;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getLength() {
    return length;
  }

  public Box1 getLargerBox(Box1 box1, Box1 box2) {
    if (box1.getVolume() > box2.getVolume())
      return box1;
    else
      return box2;
  }

  public boolean isSameBox(Box1 obj) {
    if (obj.getWidth() == width && obj.getLength() == length && obj.getHeight() == height)
      return true;
    return false;
  }
}
