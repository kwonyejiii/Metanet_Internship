/*
package ex2;

import java.util.Scanner;
//덜중요
// Switch문 : 비교하는게 다 "리터럴"일때!!!
public class SwitchDemo_자판기 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

   char button;      //button 지역변수를 참조할땐 반드시 초기화 필요!!
   String  product;

   while(true) {
     button = in.nextLine().charAt(0);

     if (button == 'x' || button == 'x')
       break;
     switch (button) {
       case "A":
         product = "콜라";
         break;
       case "B":
       case "b": //의도적으로 흐를게 해서 소문자도(자바14부터는 멀티가능)
         product = "사이다";
         break;
       case "C":
         product = "환타";
         break;
       default:
         product = "없음";
     }
     System.out.println(product);
   }




    Scanner in = new Scanner(System.in);

    String button , product;
    //button 지역변수를 참조할땐 반드시 초기화 필요!!
    button = in.nextLine();

    switch(button){
      case "A" :
        product= "콜라";
        break;
      case "B" :
      case "b" : //의도적으로 흐를게 해서 소문자도(자바14부터는 멀티가능)
        product= "사이다";
        break;
      case "C" :
        product= "환타";
        break;
      default:
         product= "없음";
    }
  }
}
*/
