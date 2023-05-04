package ex5;
//단순히 자식으로 downcasting하면 ClassCasrExaption(컴파일에서 오류는안뜨지만)
public class StudentDemo {
  public static void main(String[] args) {
    Student s ;
    Person p = new Person();
    s = (Student)p; //downcasting  오류 , 부모를 자식으로 바로 형변환 할 수 없음

    System.out.println(s.number + s.name);
    s.work();
    s.whoAmI();
  }

}
