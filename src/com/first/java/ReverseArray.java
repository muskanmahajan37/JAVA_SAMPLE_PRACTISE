package com.first.java;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        int temp=0;

        int remainder = arr.length%2;

        if(remainder==0){

        for(int i=0;i<=arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
           }
        }
        else{
            for(int i=0;i<arr.length/2;i++){
                temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=temp;
            }
        }

        for(int element:arr) {
            System.out.println(element);
            }
    }
}
