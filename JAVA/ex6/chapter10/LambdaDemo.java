package ex6.chapter10;

public class LambdaDemo {
  public static void main(String[] args) {
 /*  Object o = new Object() {
      int max(int i, int j) {
        return i > j ? i : j;
      }
    };
     o.max(1, 2); //Object클래스가 아닌내가 만든 max메소드니까 에러 //==>함수형 인터페이스 사용하기!*/

    MyFunction f = new MyFunction() {
      @Override
      public int max(int i, int j) {
        return i > j? i : j;
      }
    };
    int res = f.max(1,2);
    System.out.println(res);

    MyFunction f1 = (a,b) -> a > b ? a : b ;
    int res1 = f1.max(10,20);
    System.out.println(res1);
  }
}



    //함수형 인터페이스 (추상메소드는 하나만 가능)
    @FunctionalInterface //컴파일러가 실수 잡아줌
    interface MyFunction{
      public abstract int max(int i, int j); //추상메소드로 지정했으니 max메소드를 람다식 가능

    }


