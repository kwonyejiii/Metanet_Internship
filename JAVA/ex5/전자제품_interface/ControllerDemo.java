package ex5.전자제품_interface;

public class ControllerDemo {
  public static void main(String[] args) {
  TV tv = new TV();
  tv.turnOff();
  tv.turnOn();

  Computer computer = new Computer();
  computer.turnOff();
  computer.turnOn();
  computer.repair();

  Controllable.reset();




  }
}
