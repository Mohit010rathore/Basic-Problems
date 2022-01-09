package com.company;

public class function_overloading {
    //function overloading->two or more function of same name can exist
    //if the parameters are different
    public static void main(String[] args) {
        fun(4);
        fun("mohit");
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String s){
        System.out.println(s);
    }
}
