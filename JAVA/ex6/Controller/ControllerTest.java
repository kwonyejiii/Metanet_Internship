package ex6.Controller;
//생성자도 컨트롤러에 넣고 상속받으면 될듯
//배열을원소로 가짐
public class ControllerTest {
  public static void main(String[] args) {

    Controller[] controllers = {new TV(false), new Radio(true)};
    for(Controller controller : controllers) {
      controller.show();
    }
  }
}