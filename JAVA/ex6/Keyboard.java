package ex6;

public class Keyboard {
  String name;
  public Keyboard(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {   //@ obj로 자동형변환 <-모든 String, 배열...
    if (obj instanceof Keyboard) {

      Keyboard k = (Keyboard) obj;    //다운캐스팅
      if (name.equals(k.name)) {  //@ 그래서 구체적으로 좁힘
        return true;
      }
    }//if문 끝
    return false;
  } //equals()끝
}

class Mouse {
  String name;

  public Mouse(String name) {
    this.name = name;
  }
}