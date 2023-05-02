package ex2;

public class SumMethod_ForDemo2 {
  public static void main(String[] args) {
// < 메인 메소드 >
    int tot = sum();  //sum 메소드 호출!!  //1~10 합 = 55

    System.out.println("1~10 합 : " + tot);  //1~10 합 : 55

/*   int tot1 = sum(1,10);  //sum 메소드 호출!!
    System.out.println("1~10 합 : " + tot1);*/

    int tot2 =sum(11,20);  //sum  = 155

    System.out.println("11~20 합:  = " + tot);  //11~20 합:  = 55

    int tot3 =sum(21,30);  //sum  = 255

    System.out.println("21~30 합:  = " + tot);  //21~30 합:  = 55
    //return;
  }
  // <메소드 선언>
  public static int sum() {   //1~10합 메소드 선언!!!
    int total = 0;
    for (int i = 1; i <= 10; i++) {
      total += i;
    }
    System.out.println("1~10 합 = " + total);
    return total;
  }

  //오버로딩
  public static int sum(int from, int to) {   //데이터 타입 int
    int total = 0;
    for (int i = from; i <= to; i++) {
      total += i;
    }
    System.out.println("sum  = " + total);
    return total;
  }

  }

