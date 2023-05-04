package ex6.Controller;
//생성자-필드값초기화생성자-기본메소드-추상메소드=>추상클래스여야함
public abstract class Controller {
  boolean power;
  public Controller(boolean power) {
    this.power = power;
  }
  void show(){
    if(power){  //power가 true면
      System.out.println(getName() + "가 켜졌습니다.");  //Contrller를 상속받은 TV클래스에서 오버라이드한 추상메소드 getName()의 리턴값
    }else{
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }
  abstract String getName();  //추상메서드

}




class TV extends Controller{

  public TV(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "TV";
  }
}

class Radio extends Controller{
  public Radio(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "Radio";
  }
}