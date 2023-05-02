package ex2;

public class ForDemo2 {
  public static void main(String[] args) {
// 1~10 까지의 합
    int sum=0;
    for(int i=1; i<=10; i++){
      sum += i;
    }
    System.out.println("1~10 합 : "+sum);

    //sum초기화 주의!
    sum=0; //타입 이미 위에 선언했음!
    for(int i=11;i<=20;i++){
      sum +=i;
    }
    System.out.println("11~20 합:  = " + sum);
    //sum초기화 !
    sum=0;
    for(int i =21; i<=30; i++){
      sum +=i;
    }
    System.out.println("21~30 합:  = " + sum);

  }
}
