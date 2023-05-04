package ex6.Beverage;

public class Cup {
  private Object beverage;  //Object타입의 beverage변수 -안에 맥주,보리차..들어감

  public Object getBeverage(){
    return beverage;

  }
  //음료 담기
  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}
