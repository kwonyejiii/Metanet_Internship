package ex6.Beverage;

// 제너릭 전  (=> 제너릭 타입 후 : Object를 <T>..로 바꿈
public class GenericClassDemo {
  public static void main(String[] args) {
    Cup cup = new Cup(); //-제네릭-->  Cup<Beer> cup = new Cup<>();

    cup.setBeverage(new Beer());  ////음료 담을거야(Object타입이라 다 넣기 가능하지만)
    if (cup.getBeverage() instanceof Beer) {
      Beer beer = (Beer) cup.getBeverage();  //꺼내
      beer.drink();
    }

    cup.setBeverage(new Boricha());
    //if (cup.getBeverage() instanceof Boricha) {   //타입체크 //음료 마실거야 (꺼낼때는 타입체크필요!)
    Boricha boricha = (Boricha) cup.getBeverage();
    boricha.drink();
    //}

    try { //정상일시 try를 실행
      cup.setBeverage(new Boricha());
      Beer beer2 = (Beer) cup.getBeverage();
      boricha.drink();
    } catch (ClassCastException e) {
      throw new RuntimeException(e);
    }


  }
}
//이건 애초에 beer만 담을수있는 Beverage타입이라 오류( '컴파일오류'가 뜨게 바꿔줌), try catch 불필요
//원래Runtime오류 발생 : ClassCastException