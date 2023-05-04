package ex6.sec04;
//런타임까지가 아닌 컴파일에서 해결하기위해서사용
public class EntryDemo {
  public static void main(String[] args) {
    Entry<String, Integer> entry = new Entry("홍길동", 30); //<Key, Value>
    String name = entry.getKey();
    Integer age = entry.getValue();
    //int age = entry.getValue(); // (O) 오토 언박싱
    Integer age2 = entry.getValue();
    //char age = entry.getValue();  //(X)
    System.out.println(name+","+age);

    Entry<String, Integer> entry1 = new Entry("김선달", 20);
    Entry<Integer, String> entry2 = new Entry(3,"홍길동");
    Entry<String, String> entry3 = new Entry("20", "김선");
  }



  }



