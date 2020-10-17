package com.first.java;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();
        for (int i = number; i >0;i--){
            result = result *i;
        }
        System.out.println("factorial is :"+result);
    }
}
