package com.first.java;

public class MethodCreation {
    public static void main(String[] args) {
        //add method doesnot require to create object because static keyword is used
        int d = add(1,2);
        System.out.println(d);

        //sub method need to create object because static keyword is not used
        MethodCreation a = new MethodCreation();
        int f = a.sub(3,5);
        System.out.println(f);
    }
    public static int add(int a , int b){
        int c;
        c=a+b;
        return c;
    }
    public int sub(int a , int b){
        int e;
        e=a-b;
        return e;
    }
}
