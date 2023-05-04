package ex6;

import java.util.Calendar;
// .getInstance();로 가져와서 .YEAR..로뽑아
public class Calender {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    System.out.println(c);

    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.HOUR));
    System.out.println(c.get(Calendar.MONTH) + 1);





  }


}
