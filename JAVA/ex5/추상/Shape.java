package ex5.추상;

public abstract class Shape {
  double pi = 3.14;
  abstract void draw();
  public double findArea(){
    return 0.0;
  }
}

class Circle extends Shape{
  int radius ;
  public Circle(int radius){
    this.radius = radius;
  }
  @Override
  void draw() {//추상클래스의 추상메소드를 꼭 구현해야함
    System.out.println("원을 그리다.");
  }

  @Override
  public double findArea() {
    return pi * radius * radius;
  }
}

class Rectangle extends Shape{
  int width , height ;

  public Rectangle(int width , int height){
    this.width = width;
    this.height = height;
  }
  @Override
  void draw() {
    System.out.println("사각형을 그리다.");
  }

  @Override
  public double findArea() {//제한자 그대로해야함(int로받았지만)
    return (double) (width * height);
  }
}


