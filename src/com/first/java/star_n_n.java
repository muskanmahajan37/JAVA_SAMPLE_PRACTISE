package com.first.java;

public class star_n_n {
    public static void main(String[] args) {
//pattern 1
        for(int i=10;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print('*');
            }
            System.out.println();
        }
//pattern 2
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        for(int i=1;i<=10;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("-------------------------");
//pattern3

        for(int i=1;i<=10;i++){
            for(int j=1;j<=2*(i);j++){
                System.out.print(" ");
            }
            for(int k=10;k>=2*(i)-10;k--){
                System.out.print('*');
            }
            System.out.println();
        }
//pattern 4
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        for(int i=1;i<=10;i++){
            for(int j=1;j<=1*(i);j++){
                System.out.print(" ");
            }
            for(int k=10;k>=2*(i)-10;k--){
                System.out.print('*');
            }
            System.out.println();
        }
//pattern 5
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=2*(5-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*   ");
            }
            System.out.println();
        }
//pattern 6
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        int number =1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(number+"   ");
                number++;
            }
            System.out.println();
        }
//pattern 7
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        int num=8;
        int quo=num/2;
        int rem=num%2;
        int centre = quo + rem;
        for(int i=1;i<=centre;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int l=quo;l>0;l--) {
            for (int k = l; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
//pattern 8
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        for(int i=1;i<=5;i++){
            if(i==1){
            for(int j=1;j<=1;j++){
                System.out.print("*");
             }
            }

            if(i>=2 && i<=4) {
            System.out.print("*");
            for(int k=1;k<=i-2;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            }

           if(i==5){
            for(int l=1;l<=5;l++){
                System.out.print("*");
              }
            }
            System.out.println();
        }
    }
}
