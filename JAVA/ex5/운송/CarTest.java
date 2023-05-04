package ex5.운송;
/*■ 오버라이딩 불가
            ● private 메서드 : 부모 클래스 전용이므로 자식 클래스에 상속되지 않는다.
            ● final 메서드 : final 메서드는 더 이상 수정할 수 없으므로 자식 클래스가 오버라이딩할 수 없다.*/
//● 정적 메서드 : 클래스 소속이므로 자식 클래스에 상속되지 않는다. =>자식메소드 변수를 static으로 변경( 오버라이드 받지 않은것이다!!!)
// static :정적바인딩 : 상속안받는다. :오버라이딩x
//정적메소드를 주면 클래스에 상속되지않는다
public class CarTest {
  public static void main(String[] args) {
    Car car = new Car("파랑", 200,1000,5);
    car.show();

    System.out.println();
    Vehicle v = car;
    v.show();
  }
}


/*
int a :인스턴스 변수
static int a : 인스턴스를 만들지않고도 사용가능
그래서 static int deployment;에서 static써줘야함*/
