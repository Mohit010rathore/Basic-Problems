package com.company;

import java.util.Arrays;

public class ChangeValue_passBy {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,4,3,2};
        change(arr);//call by value
        System.out.println(Arrays.toString(arr));

        //case of string
        String name="Kunal Kushwaha";
        ChangeName(name);
        System.out.println(name);
    }
    static void change(int[] nums)//nums will be another value to the object
    {
        nums[0]=99;//if you make change to the object via this ref variable,same object will be changed
    }
    static void ChangeName(String naam)
    {
        naam="Mohit Rathore";//here we are creating a new object
    }
}
