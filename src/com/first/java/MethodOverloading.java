package com.first.java;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(add(1,3));
        System.out.println(add(1,2,3));

    }


    static int add(int a , int b ){
        System.out.println("overloaded method one");
        return a+b;
    }

    static int add(int a , int b,int c ){
        System.out.println("overloaded method two");
        return a+b+c;
    }


}
