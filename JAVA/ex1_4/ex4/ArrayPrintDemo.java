package ex4;

import java.util.Arrays;

public class ArrayPrintDemo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
      System.out.println(Arrays.toString(arr)); //Arrays클래스의 toString()메서드 사용

    }
    System.out.println(arr); //=>[I@58ceff1  //arr도 객체니까 object상속받았을거임 - toString :객체를 문자로바꿔서 찍어줌-주소값=[I@58ceff1: 배열,int
    System.out.println(Arrays.toString(arr)); //=>[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    char[] cArr={'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    System.out.println(cArr); //=>배열로써X,string취급됨 //=>abcdefg
    System.out.println(Arrays.toString(cArr));//=>[a, b, c, d, e, f, g]

  }
}
