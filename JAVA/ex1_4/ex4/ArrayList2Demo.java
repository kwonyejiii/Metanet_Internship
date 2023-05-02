package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2Demo {
  public static void main(String[] args) {
    //  n명의 학생의 점수를 입력받는다.
    // -1 이 입력되면 중지
    // 0 ~ 100 사이의 점수를 n번 입력해서 scores 동적 배열에 저장한다.
    // 총점과 평균을 구한다.

    // 동적 배열, Scanner 생성
    ArrayList<Integer> scores = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int n , sum=0;
    float avg;
    while (true) {
      System.out.println("학생의 점수를 입력하세요. 종료하려면 -1 을 입력 : ");
      n = in.nextInt();
      if (n == -1) break;
      // 동적배열에 추가
      if (n >= 0 && n <= 100) {
        scores.add(n);
      }
    }
    // 총점과 평균 구하기
    for (int score : scores) {
      sum += score;
    }
    avg = (float)sum / scores.size();
    System.out.println("입력받은 학생들의 점수와 학생수 : " + scores + "," + scores.size());
    System.out.println("총점 : " +sum);
    System.out.printf("평균 : %.2f",avg);
  }
}