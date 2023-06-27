package com.basicjava;

public class Stringarray {
    public static void main(String[] args) {
        String[] stringvalues = {"seema","Mumbai"};
        for(String values:stringvalues){
            System.out.println(values);
        }
        System.out.println("the index 1 value is :" +stringvalues[1]);
        System.out.println(stringvalues.length);
    }
}
