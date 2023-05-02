package ex1;

public class CastDemo2 {
  public static void main(String[] args) {
    // int > char
    char three;
    //int i =3;

    three = 3+ '0'; //숫자 + 문자

    System.out.println("문자3"+three); // =>문자3
    System.out.println("문자3"+three + (int)three);

    int i = three - '0'; //문자 - 문자
    System.out.println("숫자 3"+i);

      // 둘다 문자열
    System.out.println("" + 7 +7); // 77
    System.out.println( 7 +7+ ""); // 14

    // 문자와 숫자 형변환 => 래퍼클래스!!!
     //다시 숫자로 변환
    String s = "31";
    i = Integer.parseInt(s); //래퍼클래스 (오토)언박싱 : int로 바꿔서 primitive(8가지) 타입인 i에 넣음 /
    System.out.println("숫자3 + i");

    // .charAt(1: ) 1번째 문자를 three에 담아줘 --> 1나옴
    three = s.charAt(0);
    char one = s.charAt(1);
    System.out.println("one = " + one);
    System.out.println("three = " + one);
}
}