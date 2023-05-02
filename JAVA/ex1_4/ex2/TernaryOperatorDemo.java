package ex2;

public class TernaryOperatorDemo {
  public static void main(String[] args) {
    boolean res = false;
    if(1 ==1) {
      res = true;
    } else{
      res =false;
    }
    System.out.println(res);
    //삼항연산자(쇼트서킷) : 간단한 if문 표현할때
    // 조건식 ? true인 경우 : false인 경우
    // 위의 조건문과 같음
    //앞이 true일경우
    boolean res2 = (1==1) ? true : false ;
    System.out.println(res2);

    //헷갈리는부분
    int x =1, y;
    y = (x ==1)? 10:20;
    System.out.println("y = " + y);
    y = (x < 1)? x+20 : ++x;
    System.out.println("x = " + x);
    System.out.println("y = " + y);




  }
}
