package ex4.PointEx;

public class MovablePoint {
  private int xSpeed, ySpeed;

  public int getxSpeed() {
    return xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public MovablePoint(int xSpeed, int ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}

class Movable{

  private int x, y;

  //생성자
  public Movable(int x, int y) {
    this.x = x;
    this.y = y;
  }
  //toString (ctrl+O)
  @Override
  public String toString() {
    return super.toString();
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
