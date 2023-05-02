package ex2;

public class ForDemo1 {
  public static void main(String[] args) {
// 주의!
    for(int i=10; i>=1; i--){ // i+2가 아니라 i +=2 (i = i+2)
      System.out.println(i);
    }
  }
}
