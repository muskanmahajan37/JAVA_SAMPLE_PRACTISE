package com.first.java;

import java.util.ArrayList;

public class TwoD_arrayList {
    public static void main(String[] args) {
//creation of 1d array list
        ArrayList<Integer> ROLLNO = new ArrayList<Integer>();

        ROLLNO.add(1);
        ROLLNO.add(2);
        ROLLNO.add(3);

//creation of 1d array list
        ArrayList<Integer> SNO = new ArrayList<Integer>();
        SNO.add(401);
        SNO.add(402);
        SNO.add(403);

//creation of 1d array list
        ArrayList<Integer> ID = new ArrayList<Integer>();
        ID.add(11);
        ID.add(22);
        ID.add(33);

//creation of 2d array list
        ArrayList<ArrayList<Integer>> Details = new ArrayList<>();

        //adding all the 1D arraylist to 2D arraylist
        Details.add(ROLLNO);
        Details.add(SNO);
        Details.add(ID);

        System.out.println(Details.get(0).get(2));

    }
}
