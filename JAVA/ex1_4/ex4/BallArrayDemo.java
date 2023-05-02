package ex4;

import java.util.Objects;

public class BallArrayDemo {
  public static void main(String[] args) {
    // 2개엔 주소담고 3개엔 null
    Ball[] balls= new Ball[5]; //5개의 Ball 객체를 참조할 변수를 준비 //주소,공간 준비

    for (int i=0;i<2;i++){
    balls[i]=new Ball(i*5);  //생성자를 호출하여 Ball 객체를 생성 //주소 담음
  }
    //다 있다고 확신할떄(null없을때) foreach쓰기가능 -아니면 nullpointexception
    for (Ball ball : balls) {
      if(ball != null){// ball == null
        System.out.println(ball.getRadius());
      }
    //널포인트 피하기 방법1.
    if(ball!=null){
      System.out.println(ball.getVolume());
    }
    //널포인트 피하기 방법2.
      if(Objects.nonNull(ball)){
        System.out.println(ball.getVolume());
      }
    }
  }
}

class Ball {
  private double radius;

  public Ball(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getVolume() {
    return Math.PI * radius * radius * radius * 4/3 ;
  }
}
