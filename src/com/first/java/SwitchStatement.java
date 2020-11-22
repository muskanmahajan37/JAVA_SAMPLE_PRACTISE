package com.first.java;

public class SwitchStatement {
    public static void main(String[] args) {
        int date =1;
        switch (date) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
           default:
                System.out.println("not found");
                break;
        }
    }
}
