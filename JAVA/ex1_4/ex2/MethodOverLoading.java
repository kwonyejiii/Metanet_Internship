package ex2;

public class MethodOverLoading {
  public static void main(String[] args) {
    System.out.println(max(10, 20));
    System.out.println(max(10.0, 20.0));

    System.out.println(max(20, 10, 30));

  }

  public static int max(int i1, int i2) {
    return (i1 > i2) ? i1 : i2;
  }

  public static double max(double d1, double d2) {
    return (d1 > d2) ? d1 : d2;

  }

  public static int min(int j1, int j2) {
    return (j1 > j2) ? j2 : j1;
  }

  public static double min(double j1, double j2) {
    return (j1 > j2) ? j2 : j1;
  }

  public static int max(int i1, int i2, int i3) {
  return max( max(i1,i2), i3);  //주의!
  }

}
