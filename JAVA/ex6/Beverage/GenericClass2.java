package ex6.Beverage;

import ex6.Beverage.generic.Cup;

public class GenericClass2 {
  public static void main(String[] args) {
    //사용할땐 구체적인 타입 적어줘야함!!
    Cup<Beer> cup = new Cup<>();

    cup.setBeverage(new Beer());
    Beer beer = cup.getBeverage();
    beer.drink();

    //cup.setBeverage(new Boricha());

    Cup<Boricha> cup2 = new Cup<>();
    cup2.setBeverage(new Boricha());
    Boricha boricha = cup2.getBeverage();
    boricha.drink();

    //cup2.setBeverage(new Beer());
  }
}
