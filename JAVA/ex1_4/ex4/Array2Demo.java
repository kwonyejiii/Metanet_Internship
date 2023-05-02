package ex4;

import java.util.Arrays;

public class Array2Demo {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Mary";
    names[2] ="John";

    System.out.println(names);
    System.out.println(Arrays.toString(names));

    String[] names1 ={"John", "Mary", "John"};
    System.out.println(Arrays.toString(names1));
  }}