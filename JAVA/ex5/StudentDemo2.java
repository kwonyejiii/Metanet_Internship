package ex5;
//단순히 자식으로 downcasting하면 ClassCasrExaption(컴파일에서 오류는안뜨지만)
//부모를 자식으로 형변환 불가능
public class StudentDemo2 {
    public static void main(String[] args) {
      Person p; //업캐스팅 한  Person
      Person p1 = new Person(); //업캐스팅 안한 Person
      Student s = new Student();
      p = s; //업캐스팅
      p.whoAmI();
      System.out.println(p.name);

      Student s1 = (Student) p; // downcasting
      s1.work();
      s1.whoAmI();
      System.out.println(s1.name + s1.number);

      Employee e = new Employee();

      callingPerson(p1);
      callingPerson(p);
      callingPerson(s);
      callingPerson(e);
    }

  //전체 내용다쓰기위해다시 다운캐스팅


//--업캐스팅을 하는 이유는 ? 상속p44
  //Person을 상속받은 s와 e등을 전부 메소드로딩해야함 대신,메소드의 매개변수를 하나만 해서 사용
    //업캐스팅 안하면 똑같은 일을하는 메소드 3개가 필요
      //Person 하나의 인스턴스로 묶어서 관리
 //포괄적인거부터 물어보는격
static void callingPerson(Person p) {  //p대신 s나 e넣어도됨!! Person으로 자동업캐스팅되어 들어가니까
  // student 이면 work + number
  if(p instanceof Student){
    System.out.println("student");
    Student s = (Student) p;
    s.work();
  } else if(p instanceof Employee){// employee 이면 work + title
    System.out.println("employee");
    Employee e = (Employee) p;
    e.work1();
  } else  { // if(p instanceof Person) { // person 이면
    System.out.println("person");
    p.whoAmI();  //다형성을 이용해 코드축소가능

  }
}

//--다운캐스팅을 하는 이유는 ?
  //자식클래스 속성과 메소드도사용하기위해(자식클래스에만 있는 고유한 메소드실행..)
  //자기형으로 돌려줘야 자식이 '각자' 가진 필드와 메소드 사용가능
//구체적인거부터 물어봄!!!!!

//  static void callingPerson(Student s) {
//    s.whoAmI();
//  }
//
//  static void callingPerson(Employee e) {
//    e.whoAmI();;
//


    }


// 담을땐 -(업)->도형이라는 배열에 담아 -(다운)->뺴서 삼각형이 가진특징을 사용.