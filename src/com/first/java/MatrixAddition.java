package com.first.java;

public class MatrixAddition {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{4,5,6},{7,8,9}};
        int [][] mat3 = {{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
