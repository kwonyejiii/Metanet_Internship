package ex6;

public class ExceptionDemo {
  private static boolean[] arr;

  public static void main(String[] args) throws Exception {

    Thread.sleep(100);

    int[] arr = {1, 2, 3};

    System.out.println("예외처리 적용");

//여러 에러 한번에 넣기 가능!!
    //} catch (ArithmeticException  | ArithmeticException e) {

    try {
      //System.out.println(1 / 0); //예외발생
      System.out.println(arr[3]);  //컴파일이 감지못함  // ->Index 3 out of bounds for length 3 출력됨
//      String s;
//      System.out.println(s.isEmpty());
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {  //예외받아서
      //System.out.println("0 으로 나눌 수 없습니다.");
      System.out.println(e.getMessage());  //메시지출력
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("프로그램 종료");
    }
//    System.out.println("예외처리 미적용");
//    System.out.println(arr[3]);
  }
}

//this. :아직 객체생성안됐지만 미래 생성될 new를 this라고 부르자