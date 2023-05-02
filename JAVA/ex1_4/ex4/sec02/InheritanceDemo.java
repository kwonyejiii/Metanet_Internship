package ex4.sec02;

public class InheritanceDemo {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.getArea();

    Ball b = new Ball();
    b.getArea();
    b.getVolume();
  }
  }



//물려받은 getArea를 오버라이드
// ctrl+O :오버라이드
