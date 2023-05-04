package ex5.전자제품_interface;

public class ControllerDemo2 {
  public static void main(String[] args) {
Controllable[] controllables = new Controllable[3];
//{new TV()..

controllables[0] = new TV();
controllables[1] = new Computer();
controllables[2] = new Notebook();

for(Controllable controllable : controllables){
  controllable.turnOff();
  controllable.turnOn();
  controllable.repair();
  //controllable.inMyBag() ; (X)--->노트북으로 강제형변환 필요


}Controllable.reset();  //★위치주의!!

  }


}


