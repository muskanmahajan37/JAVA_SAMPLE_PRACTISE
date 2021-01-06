package com.first.java;

public class Multidimensional {
    public static void main(String[] args) {

        int [][] multi = new int [2][3];

        multi[0][0]=1;
        multi[0][1]=1;
        multi[0][2]=1;
        multi[1][0]=1;
        multi[1][1]=1;
        multi[1][2]=1;

        for(int i = 0; i<multi.length; i++){
            for(int j=0;j<multi[i].length;j++){
                System.out.print(multi[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }



    }
}
