package ex4;
// 1. 배열: 배열만 받아들임
// 2. ... : 배열,컴마 모두받아들임
public class VarArgsDemo {
  public static void main(String[] args) {
    int[] arr1 = {1,2};
    System.out.println(printSum(arr1));
    System.out.println(printSum(new int[]{1,2,3,4,5}));

    System.out.println(printSum1(1,2,3));
    System.out.println(printSum1(arr1));
    System.out.println(printSum1(1,2,3,4,5));
  }

  public static int printSum1(int... arr){ //arr배열 생성
    int sum = 0;
    for(int i : arr){
      sum += i;
    }
    return sum;
  }
  public static int printSum(int[] arr){
    int sum = 0;
    for(int i : arr){
      sum += i;
    }
    return sum;
  }
//  public static int printSum(int i, int j){
//    int sum = 0;
//    sum = i + j;
//    return sum;
//  }
//
//  public static int printSum(int i, int j, int k){
//    int sum = 0;
//    sum = i + j + k;
//    return sum;
//  }
}