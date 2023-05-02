package ex2;

public class AssignmentDemo {
  public static void main(String[] args) {
    int sum =0, i=10, j =10;
   /* sum = sum+ i;
    sum = sum+ j;*/
    sum -= i;
    sum += j;
    System.out.println("sum = " + sum);
    /*sum = sum -i;
    sum = sum-j;*/
    sum +=i;
    sum -=j;
    System.out.println("sum = " + sum);

    int value =0;
    value = value+1;
    value+= 1;

    ++ value;
    value++;
    System.out.println("value = " + ++value);
    System.out.println("value = " + value++);
  //전위 연산자
    value =0;
    int a =++value;
    System.out.println("++value = " + a);
  //후위 연산자
    value =0;
    int b =value++;
    System.out.println("value++ = " + b);
  //
    value =0;
    int c =++value;
    System.out.printf("c = ++value, c = %d, value =%d  \n", c, value);
    value =0;
    int d =value++;
    System.out.printf("d= value++, d= %d, value =%d  ", d, value); //d= value++, d= 0, value =1


  }
}
