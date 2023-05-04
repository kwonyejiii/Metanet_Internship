package ex6.Beverage.generic;

public class Cup<T> {
  private T beverage;

  public T getBeverage() {  //반환타입 T맞추기
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}
