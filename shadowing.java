package com.company;

public class shadowing {
    static int x=23; //this will be shadowed at line 10
    //shadowing in java is a practice of using two variable with the same name
    //within the scope that overlaps
    public static void main(String[] args) {
        System.out.println(x); //23
        int x=90; //the class variable at line 4 is shadowed by this
        System.out.println(x);//90
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
}
