package com.first.java;


public class IsSorted {
    public static void main(String[] args) {
        int [] sorted= {1,2,3,4,5,6};
        boolean issorted=true;

        for(int i=0;i<sorted.length-1;i++){
                if(sorted[i]<sorted[i+1]){

                }
                else{
                    issorted=false;
                    break;
                }
        }

        if(issorted){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }
    }
}
