package ex6.chapter10;

public class Rectangle implements Comparable<Rectangle> {
  private int width, height;

  public Rectangle(int width, int height) {   //생성자(=>setValue사용안해도됨)
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width*height;
  }

  @Override
  public String toString() {
    return String.format("사각형[너비=%d, 높이 =%d", width, height);

  }

  @Override
  public int compareTo(Rectangle o) {
    return getArea()-o.getArea(); //오름차순할거야  // 내림차순: o.getArea()-getArea();
  }
}

