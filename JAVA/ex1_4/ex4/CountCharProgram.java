
package ex4;

import java.util.Scanner;

public class CountCharProgram {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("문자열을 입력하세요 : ");
    String s = in.nextLine();
    System.out.print("문자를 입력하세요 : ");
    char c = in.next().charAt(0);

    System.out.printf("%s 문자열 안에는 %s 문자가 %d 번 포함되어 있다.", s, c, countChar(s, c));
  }

  static int countChar(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i)+"").equalsIgnoreCase(c+"")){
        count++;
      }
    }
    return count;
  }
}

//오버로딩하지않고 sum하나로 하기위해 가변길이 변수사용 ...

//3번문제: and, with,contains사용

