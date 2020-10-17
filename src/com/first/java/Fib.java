package com.first.java;
import java.util.*;
public class Fib {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements to print: ");
        int count = sc.nextInt();
        int a=0;
        int b=1;
        int c=1;
        System.out.println("the elements are :");
        for (int i = 0; i < count;i++){
           System.out.println(a);
           a=b;
           b=c;
           c=a+b;

        }

    }
}