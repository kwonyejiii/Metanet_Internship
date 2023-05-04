package ex6;

public class KeyBoardTest {
  public static void main(String[] args) {
    Mouse mouse = new Mouse("mouse");
    Mouse mouse2 = new Mouse("mouse");

    System.out.println(mouse);
    System.out.println(mouse2);

    System.out.println(mouse.equals(mouse2));// false(다름)
    System.out.println(mouse == mouse2); //주소값비교 // false(다름)
    //toString 오버라이딩 후
    Keyboard keyboard1 = new Keyboard("keyboard"); //keyboard
    Keyboard keyboard2 = new Keyboard("keyboard");
    System.out.println(keyboard1);
    System.out.println(keyboard2);

    //equals 오버라이딩 후

    System.out.println(keyboard1.equals(keyboard2));// 이름 같아? true
    System.out.println(keyboard1 == keyboard2); //false

  }
}
//객체내용 비교시 꼭 equals(String끼리 비교) 오버리이딩 되어있어야함