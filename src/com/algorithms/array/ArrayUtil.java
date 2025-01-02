package com.algorithms.array;

public class ArrayUtil {

  public void printArray(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }


/* resize 
  public int[] resize(int[] arr, int capacity) {
     int[] temp = new int[capacity];
     for(int i = 0; i < arr.length; i++) {
          temp[i] = arr[i];
     }
     return temp;
  }

  */


 /* 
  public static void main(String[] args) {
      ArrayUtil arrUtil = new ArrayUtil();
     // arrUtil.printArray(new int[] {5, 1, 2, 9, 10});
      int[] original = new int[] {5, 1, 2, 9, 10};
      System.out.println("The size of original array - " + original.length);
      original = arrUtil.resize(original, 10);
      System.out.println("The size of original array after resize - " + original.length);
  }
  */

  public static int findMissingNumber(int[] arr) {
      int n = arr.length + 1;
      int sum = n * (n + 1) / 2;
      for(int num : arr) {
          sum = sum - num;
      }
      return sum;
  }

  public void arrayDemo() {
    int[] arr = {1, 3, 6, 8, 2, 4, 7};
    System.out.println(findMissingNumber(arr));
  }

  public static void main(String[] args) {
     ArrayUtil arrUtil = new ArrayUtil();
     arrUtil.arrayDemo();
  }

}
