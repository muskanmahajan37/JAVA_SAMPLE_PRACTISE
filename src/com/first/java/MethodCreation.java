package com.first.java;

public class MethodCreation {
    public static void main(String[] args) {
        MethodCreation a = new MethodCreation();
        int d = a.add(1,2);
        System.out.println(d);
    }

    public int add(int a , int b){
        int c;
        c=a+b;
        return c;
    }
}
