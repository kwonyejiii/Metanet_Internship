package ex6.Human;

public class HumanTest {
  public static void main(String[] args) {
    Human.echo();

    Student s = new Student(20);
    s.print();
    s.eat();

    Human p = new Worker();
    p.print();//print(); ->Worker엔 없지만 Human 인터페이스엔 default메소드로 있음
    p.eat();

  }

}
