package ex2;

public class WhileDemo {
  public static void main(String[] args) {
    /*  for (int i = 0; i <10 ; i++){
       System.out.println(j);
        }*/

    int j =0;
    while(j <10){
      System.out.println(j);
      j++;
    }
  // =

    int k =0;
    while(true){
      //if(k>=10) break; (o)   //k가 10보다커지면 빠져나와
      System.out.println(k);
      //if(k>=10) break; (x)  값이 달라짐
      k++;
      if(k>=10) break;
    }
  }
}
