package ex5.ParentTest;
/*동적바인딩
    부모 p1= new 자식
    p1.print(); ->오버라이딩 한 print()메소드가나음*/

public class ParentTest {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();
  }
}





