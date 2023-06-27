package com.basicjava;

public class fibonacci {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8,9};
               int result = 0;
       for (int i=0;i<arr.length;i++){
           result = result + arr[i];
           System.out.println(result);
       }
    }
}
