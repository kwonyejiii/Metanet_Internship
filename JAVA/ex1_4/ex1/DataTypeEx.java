package ex1;
/* int i; //변수선언
   i =10; //초기화  */
public class DataTypeEx {
  public static void main(String[] args) {
    //1. 정수(길이)(20억)
    int fifteen=15;
    long lightSpeed = 3_000_000_000_000L;//long:8바이트(20억이상일때), int :4바이트  //3_000_000 3백만

    //2. 실수(정밀도)
    float pi =3.14159f;  //float: 4바이트(f안붙이면 double(8바이트))
    double pii =3.14159;

    fifteen =4;
    System.out.println(" fifteen = " + fifteen);




  }
}
