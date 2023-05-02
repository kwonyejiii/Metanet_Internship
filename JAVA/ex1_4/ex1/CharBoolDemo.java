package ex1;

public class CharBoolDemo {
  public static void main(String[] args) {
    char a ='a';
    char A ='A';
    char one= '1';
/*    //오류
    char two = "2";
    String three ='3' ;*/

    boolean cham  =true;
    boolean geogit  =false;

// < 형변환>
   // boolean은 형변환 불가!
    System.out.println("a = " +a+ "," +(int)a); // 형변환
    System.out.println("one = "  +A+  "," +(int)one);

    System.out.println("A = " + A);
    System.out.println("geogit = " + geogit);
// 전위,후위연산자
    System.out.println("one++ = " + one++);  //원래값 출력 후 다음부터 더해! // one++ = 1
    System.out.println("one++ = " + ++one); //참조한 다음 더해
//유니코드
    System.out.println("a = " +a+ "," +(int)a + "," + ++a); //a = a,97,b

/*    a = a,97
    one = A,49
    A = A
    geogit = false*/


  }
}
