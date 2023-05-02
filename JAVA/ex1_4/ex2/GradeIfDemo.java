package ex2;

import java.util.Scanner;
//90,80,70점 이상이면
public class GradeIfDemo {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력하세요. :");
    float score = in.nextFloat();

    //유효한 점수인지!!

    if (validateScore((int) score)) {// = true->실행

      String grade1;

      if (score > 90) {
        if (score >= 95) {
          grade1 = "A+";
        } else {
          grade1 = "A0";
        }
      } else if (score > 80) {
        grade1 = "B";

      } else if (score > 70)
        grade1 = "C";
      else
        grade1 = "D";
      System.out.println("grade = " + grade1);
      System.out.println("종료");
    }

    }
// < 메소드>
  public static boolean  validateScore(int i){
    return (i<0 || i>100)? false : true;
/* =   if(i<0 || i>100)  return false; //빠져나옴
        return true;*/

  }


/*      if (score > 90) {
        System.out.printf("%2.2f점 이상은 A입니다.", score);
      } else if (score > 80) {
        System.out.println("B입니다.");

      } else if (score > 70)
        System.out.println("C입니다.");
      else
        System.out.println("F입니다.");*/


  /*  float score = in.nextFloat();
  char grade ;
    if (score > 90) {
      grade= 'A';
    } else if (score > 80) {
      grade= 'B';

    } else if (score > 70)
      grade= 'C';
    else
      grade= 'D';
    System.out.println("grade = " + grade);
    System.out.println("종료");*/

}

