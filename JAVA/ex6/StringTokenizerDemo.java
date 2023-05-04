package ex6;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {

    String s = "of the people, by the people, for .the people";
  //" ,." 각 포함
    StringTokenizer st = new StringTokenizer(s, ",.", true); //다 딜리미터로 사용됨
    System.out.println(st.countTokens());
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

  }
}
