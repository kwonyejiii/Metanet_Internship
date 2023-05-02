package ex4.sec04;

public class Circle1 {

  public int radius;
  public Circle1(int radius){

    this.radius = radius;
    }

  void show(){
    System.out.println("반지름이"+radius);
  }

}
  class ColorCircle extends Circle1 {
  String color;
  //생성자는 상속못받으니, 부모의 생성자 호출(super())해서 사용

    public ColorCircle(int radius, String color) {
      super(radius);  //생성자 ->맨 윗줄!!!!
      this.color = color;
    }

//밑에 대신 toString으로 오버라이드하면 주소값대신 문자나옴  ..object toString 주소값을 찍는게 아니라 "반지름이~인 빨간색원이다"가 나옴
    @Override
    public String toString() {
      return super.toString();
    }

    @Override
    void show() {

      System.out.println("반지름이"+radius+"원이다!");
    }

  }