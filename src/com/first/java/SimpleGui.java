package com.first.java;

import javax.swing.JOptionPane;

public class SimpleGui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("enter your name ?");
        JOptionPane.showMessageDialog(null,"hello "+name);


        int age = Integer.parseInt(JOptionPane.showInputDialog("please enter your age"));
        JOptionPane.showMessageDialog(null,"your age is "+age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null, "your height is "+height);


        if (name.equals("rohan")){
            JOptionPane.showMessageDialog(null,"hi admin");
        }
        else {
            JOptionPane.showMessageDialog(null,"your not admin retry");
        }


    }
}
