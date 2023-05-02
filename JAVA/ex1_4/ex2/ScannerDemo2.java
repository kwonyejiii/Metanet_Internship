package ex2;

import java.util.Scanner;

public class ScannerDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //참조변수(주소)의 데이터 타입은 Scanne타입 // System.in을 매개변수로 가지는 Scanner 객체생성
    System.out.println("첫번째 숫자를 입력하세요 : ");
   // in.nextLine()에 대고 ctl + alt + v
    String x = in.nextLine();
    int i = Integer.parseInt(x); //문자를 받아서 숫자로 저장!

    System.out.println("두번째 숫자를 입력하세요 : ");
    String y = in.next();
    int j = Integer.parseInt(y);
    System.out.printf("x + y = %d + %d = %d", i,j,i+j);



  }
}
// ❤자동으로 같은타입 변수 생성 : ctl + alt + v
//  new Scanner(System.in);
// in.nextLine()
//Integer.parseInt(y);
