package ex5.move;

public class Car implements Movable{
  //매개변수 있는 버전 => private int position; , 메서드 매개변수 추가(내용변경)
  private int position;
  @Override
  public void move( int x) {
    position += x;
  }

  public void show() {
    System.out.println(position + "m 이동함");
  }
}

