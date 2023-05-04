package ex6.Arrays;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {

    char[] a1 = {'j', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, a1.length);
  
     Integer[] a3 ={1,2,3}; // int나 char..[] a3 ={1,2,3};=>(X)  why????
      printArray(a3);  // printArray메소드는 Object을 원소로 갖기 때문에 기본타입을 넣으면 오류
      System.out.println(a2);

      String[] sa = {"케이크", "애플", "도넛", "바나나"};
      printArray(sa);

      Arrays.sort(sa);    //sort();   :void 메소드라 알아서 sa에 넣어줌 , 반환값이있다면
      printArray(sa);

      Arrays.fill(sa, 2,3,"기타");  // fill(선택) : (배열, 2부터, 2(3 전)까지, "이거로") 바꿔라
      printArray(sa);



  }

      static void printArray(Object[] array){//Object을 원소로 갖음
        System.out.println(Arrays.toString(array));
      }

    }

