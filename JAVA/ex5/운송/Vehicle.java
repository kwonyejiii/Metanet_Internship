package ex5.운송;

public class Vehicle {
  static String color;
  static int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  static void show(){
    System.out.println("색상 : " + color + "\n속도 : " + speed);
  }
}

class Car extends Vehicle {
  static int displacement; // 자동차 배기량
  static int gears; // 자동차 기어 단수

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }


  static void show() {
    System.out.println("색상 : " + color + "\n속도 : " + speed +
        "\n배기량 : " + displacement +
        "\n기어 단수 : " + gears );
  }
}