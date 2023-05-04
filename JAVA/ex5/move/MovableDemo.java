package ex5.move;

public class MovableDemo {
  public static void main(String[] args) {
  //인터페이스는 객체 생성불가능!! so 업캐스팅!
    Movable m = new Car();
    m.move(5);
    //m.show()

    Car c = (Car) m;
    c.move(5);
    c.show();
  }
}