package com.company;

import java.util.Arrays;

public class variable_arguments_varargs {
    public static void main(String[] args) {
        fun(34,54,3,23,4);
    }
    static void fun(int ...v) //can take any number of arguments
            //or we can say array of int,string or etc.
    {
        System.out.println(Arrays.toString(v));
    }
}
