package ex2;

public class SwitchDemo {
  public static void main(String[] args) {
    int value =10;
    switch(value){  //int만 가능!!!(변수 or 연산식)
      case 10 :  //case엔 상수(int)만 가능
        System.out.println("10입니다.");
        break; //안흐르게(빠져나옴)
      case 11:
        System.out.println("11입니다.");
      default:
        System.out.println("둘다아님");

/*      //실수면?
        double value =10.0;
        switch((int)value){  //int만 가능!!!(변수 or 연산식)
          case 10 :  //case엔 상수(int)만 가능
            System.out.println("10입니다.");
            break; //안흐르게(빠져나옴)
          case 11:
            System.out.println("11입니다.");
          default:
            System.out.println("둘다아님");*/
    }
  }
}
