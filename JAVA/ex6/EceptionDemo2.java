package ex6;

public class EceptionDemo2 {
  public static void main(String[] args) {
    //방1) 내가 하기: ctrl+alt+T : try-catch로 감싸기
    try {
      test1("123");
      test1("abc");
    } catch (NumberFormatException e) {
      System.out.println("숫자로 변환할 수 없는 문자열입니다.");
      System.out.println(e.getMessage());
    } finally {
    }
  }

  private static void test1(String s) throws NumberFormatException{
    int n = Integer.parseInt(s);  // "123" (O), "abc" (X)
    System.out.println(n);


//방2 ) 떠넘기기 : lang.에러이름 복사해서 ->throws 에러이름


  }


}


//Thread.sleep(1000); 빨간줄 고치기
//Exception을 던지니까 처리해줘야해
