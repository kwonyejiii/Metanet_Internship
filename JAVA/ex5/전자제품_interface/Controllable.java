package ex5.전자제품_interface;
  //interface 문서화
             /* ◼ 문서화 태그 종류
              ⚫ @param : 메소드의 파라미터에 대한 정보
              ⚫ @return : 메서드의 반환 타입
              ⚫ @throws : 발생 가능성이 있는 모든 예외
              ⚫ @implSpec : 메서드에 대한 정보*/
/**
 *
 */



//모든 전자제품에 포함되어야 하는 제어부
public interface Controllable {
  void turnOn();
  void turnOff();

  //수리 및 공장 초기화 기능을 미리 구현해 놓아서 필요할 때 사용할 수 있어야 한다.

  //수리 기능은 자식 클래스에서 오버라이딩할 수도 있다
  default void repair(){   // 구현 자유
    System.out.println("장비를 수리하다");
  }

  static void reset(){
    System.out.println("장비를 초기화한다");
  }
}
