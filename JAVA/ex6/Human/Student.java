package ex6.Human;

class Student1 implements Human{
  public Student1(int age) {
    System.out.println(age +"의 학생입니다.");
  }
  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");

  }
  public void print() {
  }
}
