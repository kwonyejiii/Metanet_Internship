package ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    // 화면으로부터 학생 5명의 점수를 입력받습니다.
    // 5명의 점수를 배열에 저장합니다.
    // 배열을 읽어서 총점과 평균을 구하세요.
    Scanner in = new Scanner(System.in);
    int[] scores = new int[5];
    for (int i = 0; i < scores.length; i++) {
      System.out.print("점수" + (i + 1) + "을 입력하세요 : ");
      scores[i] = in.nextInt();
    }
//    int sum = 0;
//    for (int i = 0; i < scores.length; i++) {
//      sum += scores[i];
//    }
    int sum = 0;
    for(int score : scores){  // for each문
      sum += score;
    }
    float avg = sum / (float)scores.length;

    System.out.println("입력받은 학생들의 점수 : " + Arrays.toString(scores));
    System.out.println("총점 : " + sum);
    System.out.printf("평균 : %.2f" , avg);
  }
}