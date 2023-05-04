package ex5.Talk인터페이스;

public class TalkableTest {
    static void speak(Talkable talkable) {  //매개변수로 인터페이스 사용
      System.out.println(talkable.talk());
    }
    public static void main(String[] args) {
        speak(new Korean()); //-->매개변수 Talkable talkable로 자동 업캐스팅되어 들어감
      //  speak(new American());//-->매개변수 Talkable talkable로 자동 업캐스팅되어 들어감
    }


}
