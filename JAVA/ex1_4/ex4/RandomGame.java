package ex4;
//스트링배열,형변환,클래스메소드사용
import java.util.Arrays;

//0~1까지 실수값 =>형변화 필요
public class RandomGame {
  public static void main(String[] args) {
    String[] name = {"가위","바위","보"};
    int tmp;
    System.out.println(name);
    System.out.println(Arrays.toString(name));

    for(int i = 0; i < 30; i++) {
      //System.out.println(Math.random());
      //System.out.println(Math.random() * 2);
      //System.out.println((int)Math.random()*3);
      tmp = (int)(Math.random()*3);
      System.out.println(name[tmp]);
    }
  }
}