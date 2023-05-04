package ex5.추상;

public class ShapeDemo {
  public static void main(String[] args) {
    //Shape shape = new Shape(); 불가능
    Circle circle = new Circle(3);
    circle.draw();
    System.out.printf("원의 넓이는 %.1f \n", circle.findArea());
    Shape shape = new Circle(3);

/*    방법1. Circle데이터타입으로 만들기 (* 상속받은 Circle 속성을 사용불가)
    Circle circle1 = new Circle();*/

/*    방법2.다형성 (자식을 업캐스팅)
    Shape shape1 = new Circle();*/


  }
}
