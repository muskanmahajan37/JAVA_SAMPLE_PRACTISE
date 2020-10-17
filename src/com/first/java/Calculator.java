package com.first.java;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:");
    int num_1=sc.nextInt();
    System.out.println("enter number two:");
    int num_2=sc.nextInt();
    System.out.println("enter the opertation:");
    sc.nextLine();
    char operator = sc.nextLine().charAt(0);
    int result=0;
    switch(operator){
        case '+':
            result=num_1+num_2;
            break;
        case '-':
            result=num_1-num_2;
            break;
        case '*':
            result=num_1*num_2;
            break;
        case '/':
            result=num_1/num_2;
            break;
        default:
            System.out.println("valid operators are : + - * / ");
            System.out.println("please try among them");
            result=0;
            break;
    }
    System.out.println("the result is : "+result);
    }
}
