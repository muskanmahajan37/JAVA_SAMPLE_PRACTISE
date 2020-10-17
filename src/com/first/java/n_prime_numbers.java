package com.first.java;

import java.util.Scanner;

public class n_prime_numbers {
    public static void main(String[] args) {
        System.out.println("enter the range:");
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        for (int i =2;i<=range;i++) {
            if ( (i % 2 == 0 && i!=2)
                    || (i % 3 == 0 && i!=3) || i % 4 == 0 ||
                    (i % 5 == 0 && i!=5) || i % 6 == 0 ||
                    (i % 7 == 0 && i!=7) || i % 8 == 0 ||
                    i % 9 == 0 || i % 10 == 0 ) {
//                System.out.println("number is not prime");
            } else {
//                System.out.println("number is prime");
                    System.out.println(i);
            }
        }
    }
}
