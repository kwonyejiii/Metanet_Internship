package ex5.인터페이스ex;
/*2개의 인터페이스를 모두 사용하는 클래스가
    자주 발생한다. 하나의 인터페이스로 통합된 Delicious 인터페이스를 작성하시오.*/

public interface Delicious extends Edible, Sweetable {

}



//다 public이면 이렇게 파일합치기 가능
interface Sweetable {
  void sweet();
}
interface Edible {
  void eat();
}
