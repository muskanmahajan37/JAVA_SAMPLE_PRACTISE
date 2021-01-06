package com.first.java;

public class arrays {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5};
        System.out.println(marks[3]);
        System.out.println(marks.length);
        System.out.println("-----------");
        //old format of declaring an array
        for(int i =0 ;i<marks.length;i++){
            System.out.println(marks[i]);
        }
         System.out.println("-----------");

        //new format of declaring the array
        for(int element:marks){
            System.out.println(element);
        }
    }
}
