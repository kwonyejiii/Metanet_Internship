package ex4.sec04;

public class InheritanceDemo1 {
  public static void main(String[] args) {
    Circle1 c1 = new Circle1(10); //부모생성자
    c1.show();

    Circle1 c2 = new Circle1(10,"빨강");
    c1.show();
/*    ex4.sec02.Circle c = new Circle();
    c.getArea();

    ex4.sec02.Ball b = new ex4.sec02.Ball();
    b.getArea();
    b.getVolume();*/
  }
  }



//물려받은 getArea를 오버라이드
// ctrl+O :오버라이드
