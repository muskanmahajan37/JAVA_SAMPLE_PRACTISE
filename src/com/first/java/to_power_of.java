package com.first.java;
import java.util.Scanner;
public class to_power_of {
    public static void main(String[] args) {
        System.out.println("enter number base number: ");
        Scanner sc = new Scanner(System.in);
        int  base = sc.nextInt();
        System.out.println("enter number power number: ");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <=power; i++){
            result = result * base;
        }
        System.out.println("the result is :"+result);
    }
}
