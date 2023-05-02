package ex2;

public class PrimitiveParam {
  public static void main(String[] args) {
    int sum =100;
    System.out.println("before method sum = " + sum);
    //메소드 실행
    increment(sum); // 1.매개변수로 sum을 넘겨줌  //100

    System.out.println("after method sum = " + sum);
  }

  public static void increment(int i){ //2.sum을 int i로 받음  //100
    // 3.실행
    int sum =i; //지역변수!(콜스택(메소드안)에 있을때만 존재,return시 사라짐) //100
    sum++;  //101
    System.out.println("in method sum = " + sum);
// read-only 여기서 끝!- 다시 메인으로 넘겨주지X
  }
}
