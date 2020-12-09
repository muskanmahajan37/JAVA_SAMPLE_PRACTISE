package com.first.java;

public class minFind {
    public static void main(String[] args) {

        int c = maxFinding(1,2);
        System.out.println(c);
        System.out.println(c);
    }

    public static int maxFinding(int  a,int  b){
        int min ;
        if(a>b){
            min =b;
        }
        else{
            min=a;
        }
        return min;

    }
}
