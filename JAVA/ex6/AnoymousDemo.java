package ex6;
//중첩클래스
public class AnoymousDemo {
  //선언부가 없는 Eagle익명클래스

  Bird e = new Bird(){   //익명클래스 부모타입의 참조변수로 만들었음.
    @Override
    void move() {
      System.out.println("독수리가 날아간다.");
    }

    void sound(){
      System.out.println("휘익~~");
    }
  };

  public static void main(String[] args) {
    AnoymousDemo a = new AnoymousDemo();
    a.e.move();
    //a.e.sound();   자동업캐스팅되어서 못씀
  }
}

