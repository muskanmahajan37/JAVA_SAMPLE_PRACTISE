package com.first.java;

public class BitWiseOperator {
    public static  void main(String[] args){
        int a = 10;
        int b = 12;
        //logical or operator
        int c = a|b;
        //logical and operator
        int d = a & b;
        //logical right shift operator
        int e = a >> 1;
        //logical left shift operator
        int f = b << 1;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
