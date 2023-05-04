package ex6.Beverage;

import java.util.ArrayList;
// 제너릭 전
public class GenericDemo3 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("123");
    list.add('a');
    list.add(true);
    list.add("abc");

    //꺼낸 다음엔 타입체크
    int res;
    if (list.get(0) instanceof Integer) {
      res = (int) list.get(0) + 1;
    } else if (list.get(0) instanceof String) {
      res = Integer.parseInt((String) list.get(0)) + 1;
    }
  }
}
