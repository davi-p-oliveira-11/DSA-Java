package com.algorithms.array;

public class MaximumValue {

    public void printArray(int[] arr) {
       int n = arr.length;
       for(int i = 0; i < n; i++) {
         System.out.println(arr[i] + " ");
       }
       System.out.println();
    }

    // Find secondMax algo

    int findSecondMax(int[] arr) {
         int max = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;
         for(int i = 0; i < arr.length; i++) {
              if(arr[i] > max) {
                   secondMax = max;
                   max = arr[i];
              } else if (arr[i] > secondMax && arr[i] != max) {
                   secondMax = arr[i];
              }
         }
         return secondMax;
    }
    
    public static void main(String[] args) {
      int[] arr = {5, 9, 3, 15, 1, 2};
      MinArray ma = new MinArray();
      System.out.println(ma.findMinimum(arr));
    }
}
