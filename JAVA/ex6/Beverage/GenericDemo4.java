package ex6.Beverage;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    //list.add("1234"); x
    //list.add(2.0);  x
    //list.add(3L);  x
    //그냥 꺼내도 인티져
    int res = list.get(0) + 1;
    System.out.println(res);
  }
}
