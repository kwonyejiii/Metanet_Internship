package ex5;

public class PersonDemo {
  public static void main(String[] args) {
    Person p , p1 ;
    Student s1;
    Employee e1;
    Student s = new Student();
    Employee e = new Employee();
  //P = (Person)s과 같음  //업캐스팅(자동형변환) : 자식을 부모타입과 동일한 형으로 맞춰주는것 ->업캐스팅을 다시쓰려고돌리는게 다운캐스팅
            // s(자식)이 p로 형변환 했지만
            // p(부모)s가 가진메소드는 사용불가
    p = s; // p=(Person)s; , upcasting
    p.name = "John";
    p.whoAmI();
//    p.number;
//    p.work();

    p1 = e;
    p1.name = "홍길동";
    p1.whoAmI();
//    p1.title;
//    p1.work();

    //s1 = (Student)e1;

  }
}





