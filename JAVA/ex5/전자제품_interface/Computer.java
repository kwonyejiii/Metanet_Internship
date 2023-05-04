package ex5.전자제품_interface;

public class Computer implements Controllable {
  @Override
  public void turnOn() {
    System.out.println("컴터 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("컴터 켠다");
  }

  @Override
  public void repair() {
    System.out.println("컴터를 수리하다");
  }
  //controller 구현, on,off, repair 기능 구현
}
