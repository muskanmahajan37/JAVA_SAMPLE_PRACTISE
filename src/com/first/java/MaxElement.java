package com.first.java;

public class MaxElement {
    public static void main(String[] args) {

        int [] array= {1,2,3,4,5,6,7};
        int max =0;
        for(int i =0; i < array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("the max element is : "+max);

    }
}
