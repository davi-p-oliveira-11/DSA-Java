package com.algorithms.array;

public class MinArray {

    // Find the minimum value in an array

    public int findMinimum(int[] arr) {
       
      if(arr == null || arr.length == 0) {
           throw new IllegalArgumentException("Invalid Input");
      }

      int min = arr[0]; // min will hold the minimum of an array
      for(int i = 1; i < arr.length; i++) {
          if(arr[i] < min) {
              min = arr[i];
          }
       }
       return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};
        MinArray ma = new MinArray();
        System.out.println(ma.findMinimum(arr));
    }
}
