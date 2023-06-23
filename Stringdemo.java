package com.basicjava;

public class Stringdemo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("String are equal");
        }else{
            System.out.println("String not equal");
        }
    }
}

