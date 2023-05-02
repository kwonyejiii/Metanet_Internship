package ex2;

public class CompLogicDemo {
  public static void main(String[] args) {
    int x=0, y=1;
    System.out.println(y < 1 && x<1);
    //가독성  System.out.println( (y < 1) && (x<1) );

    System.out.println( (y < 1) && (x<1) );
    System.out.println( (x < 1) && (y<1) );

    /*    쇼트서킷
    &&일 경우 false인걸 앞에 쓰면 속도빨라짐  eg) null 먼저 씀
    ||일 경우 true인걸 앞에 쓰면 속도빨라짐    eg) null 나중에 씀    */
  }
}
