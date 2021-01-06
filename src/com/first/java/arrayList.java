package com.first.java;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> rollno = new ArrayList<Integer>();

        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        for (int i=0;i<rollno.size();i++){
            System.out.println(rollno.get(i));
        }

    }
}
