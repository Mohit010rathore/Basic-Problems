package com.company;

import java.util.Scanner;

public class Functions {
    //in java there is only pass by value no pass by reference
    //for objects and reference there is only pass by value as an reference only

    public static void main(String[] args) {
           //Function
        //Q:take input of two numbers and print the sum
       // sum();

//        int x;
//        //x=sum2();
//        x=sum3(4,5);
//        System.out.println(x);
        //System.out.println(x);
        //string input and taking argument as string
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        String naam= input.next();
        String person=myGreet(naam);
        System.out.println(person);
    }

    static String myGreet(String name) {
        String mssg="hello "+name;
        return mssg;
    }

    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1= input.nextInt();
        System.out.print("Enter 2nd number:");
        int num2= input.nextInt();

        int sum=num1+num2;

        System.out.println(sum);
    }
    //returning the value(type int)
    static int  sum2(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1= input.nextInt();
        System.out.print("Enter 2nd number:");
        int num2= input.nextInt();

        int sum=num1+num2;

        return sum;
    }
    //pass the value of numbers when u are calling the method in main()
    static int sum3(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    //parameter string function
    static String greet(){
        String greeting="how are u buddy";
        return greeting;
    }

}
