package ex6.chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo2 {
  public static void main(String[] args) {
// Comparator
    List<String> list = Arrays.asList("a", "c", "e", "d");
    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2); // ascending order
      }
    });
    System.out.println(list);

    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1); // descending order
      }
    });
    System.out.println(list);

    Collections.sort(list, (o1, o2)-> o1.compareTo(o2));
    System.out.println(list);
  }
}


//{a,c,d,e} 작은거를 앞에둘때 음수가나오면 '어센딩'  //앞에꺼를 뒤에놓으면
//{e,d,c,a} 디센딩 : 뒤에꺼를 앞에 놓으면