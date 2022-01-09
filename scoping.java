package com.company;

public class scoping {
    public static void main(String[] args) {
        int a=10;
        int b=20;

//        random(a);
        //below is block scope
        {
            //int a = 33; //already initialized outside the same block in the same method, hence u can not initialize it again
            a=45;//but u can change the value for sure
            int c = 98;
            //values initialized in this block will remain in this block
        }
        //System.out.println(c);//cannot be used  outside the block
        //scoping in for loops has same concept as block scope
        for (int i=0;i<4;i++)
        {
            System.out.println(i);
            int num=60;
        }
        //anything that is outside u can use inside but anything that is initialized
        //inside u cannot use outside
    }
    static void random(int marks)
    {
        int num=66;
        System.out.println(num);
        System.out.println(marks);
    }
}
