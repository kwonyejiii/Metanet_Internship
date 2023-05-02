package ex2;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //참조변수(주소)의 데이터 타입은 Scanne타입 // System.in을 매개변수로 가지는 Scanner 객체생성
    System.out.println("첫번째 숫자를 입력하세요 : ");
    int x = in.nextInt();
    System.out.println("두번째 숫자를 입력하세요 : ");
    int y = (int)in.nextFloat();
    System.out.printf("x + y = %d + %d = %d", x,y,x+y);
  }
}
