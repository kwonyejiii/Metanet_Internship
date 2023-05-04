package ex5;

public interface A {
  void method1();
  void method2();
  void method3();

  default void method4(){};
}

class C implements A {
  @Override
  public void method1() {

  }
  @Override
  public void method2() {

  }
  @Override
  public void method3() {

  }
}