package ex5.ParentTest;

public class Parent {
  String name = "영조";

  void print(){
    System.out.println("영조입니다.");
  }
}

class Child extends Parent{
  String name = "사도세자";

  void print(){
    System.out.println("사도세자입니다.");
  }
}
