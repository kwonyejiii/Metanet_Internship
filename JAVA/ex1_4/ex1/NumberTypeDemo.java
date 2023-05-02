package ex1;

public class NumberTypeDemo {
  public static void main(String[] args) {
    int mach =340;
    int distance = mach * 60 * 60;
    System.out.println("소리가 1시간동안 가는거리 = " + distance);  //20억이하

    double redius = 10.0; //정밀
    double area = 3.14 * redius*redius; //다 double
    System.out.println("반지름이 = " +redius + "인 원릐 넓이 "+area);
  }
}
