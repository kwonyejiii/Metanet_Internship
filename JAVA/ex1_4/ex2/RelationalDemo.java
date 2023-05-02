package ex2;

public class RelationalDemo {
  public static void main(String[] args) {
    // ==, !==은 숫자만 가능
    int i =1, j=1, k=10;
    System.out.println("i ==j ? " + (i == j)); //문자와 숫자라 우선순위()로 묶어주기
    System.out.println("i ==k ? " + (i != k));
    // 둘다 true나옴
  }
}
