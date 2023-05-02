package ex4.sec03;

public class Circle {
  public double radius;  //상속해줄거임 public
  private void secret() {
    System.out.println("비밀입니다.");
  }

  protected void getRadius() {
    secret();
    System.out.println("반지름은 10.0 입니다.");
  }

  public void getArea() {
    System.out.println("넓이는 PI*R*R 입니다.");
  }
}

class Ball extends Circle {
  String color;
  public Ball(double radius, String color) {
    super.radius = radius;
    this.color = color;
  }

  @Override  //오버라이딩 : 반환타입,시그니처 같아야함
  protected void getRadius() { //default, private 불가능!
    super.getRadius(); //부모가 가진 .getRadius()메소드를 그대로 쓰겠다
  }

  @Override
  public void getArea() {
    super.getArea();
  }
}
/*
  인스턴스 변수와 함수를 정의할 때 사용하는 접근자
  : public > protected > default > private

public : 다른 패키지에서도            접근 가능
protected : 상속 받은 클래스에서      접근 가능
default : 동일 패키지 내에서만        접근 가능
private : 자기 클래스에서만           접근 가능(정보은닉)*/


/*  내가 내 인스턴스 접근: this
생성자 접근: this()
내자신 : return this

    부모 접근 super
    부모생성자접근 super()*/
