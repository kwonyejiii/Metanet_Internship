package ex6.chapter10;

import java.util.Arrays;

public class ComparableDemo {
  public static void main(String[] args) {
    String[] array = {"a", "b", "c", "d", "e"};
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));

    Integer[] integers = { 10, 20, 30, 40}    ; //= 래퍼클래스 Integer를 원소로 갖는 배열
                       // 클래스여도 int끼리 비교가능한이유 public final class Integer extends Number implements Comparable<Integer>, Constable, ConstantDesc {
    Arrays.sort(integers); //<= Comparable이 구현되어야함  //ClassCastException
    System.out.println(Arrays.toString(integers));

    Rectangle[] rectangles = { new Rectangle(10, 20),
        new Rectangle(30, 40),
        new Rectangle(50, 60) };
    Arrays.sort(rectangles);
    for (Rectangle r : rectangles) {
      System.out.println(r);
    }
  }
}





