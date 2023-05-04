package ex5.Phone;

public class Phone {
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  void talk(){
    System.out.println(owner + "가 통화중입니다.");
  }
}

class Telephone extends Phone {
  private String when;

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  public Telephone(String owner) {
    super(owner);
  }

  void autoAnswering() {
    System.out.println(owner + "가 부재중이니 " + when + " 전화바랍니다.");
  }
}

class SmartPhone extends Telephone {
  private String game;

  public SmartPhone(String owner, String game) {
    super(owner);
    this.game = game;
  }

  void playGame() {
    System.out.println(owner + "가 "+ game + " 게임중입니다.");
  }
}