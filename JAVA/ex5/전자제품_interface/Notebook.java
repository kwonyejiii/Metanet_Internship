package ex5.전자제품_interface;

public class Notebook extends Computer implements Portable{
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

  }

  @Override
  public void inMyBag() {

  }
}
