package ex2;

import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 입력하세요 : ");
    int i = sc.nextInt();
    System.out.printf("입력받은 숫자가 %d이고 이 숫자는 2로 나누면 나머지가 %d입니다. : ",i,i%2);

  }
}
