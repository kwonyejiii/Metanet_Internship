package ex4;

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println(Direction.East);
    System.out.println(Direction.South);
    System.out.println(Direction.West);
    System.out.println(Direction.North);

    final int NORTH = 0;
    final int SOUTH = 1;
    final int EAST = 2;
    final int WEST = 3;
    final int UP =0;
    final int DOWN = 1;
    //if(UPDown.UP = Direction.North)  :컴파일러에서 걸러줘 필요xx

      System.out.println(Direction.North);
      System.out.println(Direction.South);
      System.out.println(Direction.East);
      System.out.println(Direction.West);

      Direction dir = Direction.East;
      if(dir == Direction.East){ //부등호 불가! (무자열로 저장되어있음)
        System.out.println("East 동쪽");
      }else if(dir.compareTo(Direction.West) == 0 ){
        System.out.println("West");

      }

  }
}
/*
  제핚된 수의 일이나 사건 등에 대하여 숫자로 표현
 각 숫자에 대하여 부여된 의미를 개발자가 숙지 => 일이나 사건에 대핚 경우의 수가 맋다면 개
    발자 관점에서 불편
     부여되지 않은 의미 없는 숫자 => 컴파일러는 알 수 없다.
     출력 값이 의미 없는 숫자로 표현
     제핚된 사건에 대하여 숫자 대싞에 상수를 정의해서 부여
     숫자에 부여된 의미를 개발자가 알 수 있지맊, 여젂히 나머지 문제가 미결*/
