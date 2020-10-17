package com.first.java;
import java.util.*;
public class elfi_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Value = sc.nextInt();
        if (Value <= 10) {
            System.out.println("less than 10");
        } else if (Value > 10 && Value <= 20) {
            System.out.println("between 10 and 20");
        } else {
            System.out.println("greater than 20");
        }
        int result = 0;
        result= Value>=10 ? result : 0;
         System.out.println(result);
    }
}
