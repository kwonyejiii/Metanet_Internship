package ex5.전자제품_interface;

public class TV implements Controllable{
  //추상화 메소드 오버라이딩
  //모든 전자제품에는 전원을 온·오프하는 기능
  //수리 기능
  @Override
  public void turnOn() {
    System.out.println("티비 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("티비 끈다");
  }
}
