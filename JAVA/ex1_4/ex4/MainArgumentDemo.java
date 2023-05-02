package ex4;
public class MainArgumentDemo {
  public static void main(String[] args) { //또는 String... args :몇개들어올지모를때 (args:배열)  //다른타입이면 int... Data ...

    if(args.length == 2) { //2일때
      System.out.println(args[0]+" " + args);
      nPrint(args[0], Integer.parseInt(args[1]));  // int n이니까 string으로 바꿔주기
    }
  }

  public static void nPrint(String msg, int n) {
    for (int i = 1; i < n; i++) {
      System.out.println(msg);

    }

  }
}
