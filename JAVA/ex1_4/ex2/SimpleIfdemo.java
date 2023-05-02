package ex2;

import java.util.Scanner;
// sc.next() 공백 전까지 입력을 받음
// sc.nextLine() 한 줄 전체를 입력 받음
//    sc.nextInt(), sc.nextDouble() // sc.next+자료형() => 자료형에 따라 입력을 받음
public class SimpleIfdemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //참조변수(주소)의 데이터 타입은 Scanne타입 // System.in을 매개변수로 가지는 Scanner 객체생성
    System.out.println("숫자를 입력하세요 : ");
    int i = in.nextInt();

    int res = i % 2;

    //양수인지 음수인지
    int a = in.nextInt();

    if(a<0) {
      System.out.println("음수");
    } else if(a>0) {
      System.out.println("양수");
    } else {
      System.out.println("아무것도아님");
    }

    }



  }


