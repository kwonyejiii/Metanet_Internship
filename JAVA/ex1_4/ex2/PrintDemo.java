package ex2;

public class PrintDemo {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(4);
    System.out.println(3);

    System.out.print(1);
    System.out.print(4);
    System.out.print(222222222);



    int i=2, i2=3, i3=3; //선언+초기화 여러개 동시에
    System.out.println("i = " + i + "i2 = " + i2 + "i3 = " + i3 );
    System.out.printf("i1 =%d , i2 =%d, i3 = %d\n", i,i2,i3);

    float f1 =1.0f,f2 =2.0f,f3 =3.0f ;
    System.out.printf("i =%d , f2 =%f\n",i, f2);
    System.out.printf("f1 =%f , f2 =%f, f3 = %f\n",f1, f2, f3);
    System.out.printf("f1 =%.1f , f2 =%1.2f, f3 = %.3f\n",f1, f2, f3);


  }
}
