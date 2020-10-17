package com.first.java;
import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number%2==0 || number%3==0 || number%4==0 || number%5==0 || number%6==0 || number%7==0 || number%8==0 || number%9==0 || number%10==0){
            System.out.println("number is not prime");
        }else{
            System.out.println("number is prime");
        }
    }
}
