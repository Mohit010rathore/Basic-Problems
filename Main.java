package com.company;

//package->its the folder in which your java file exists
import java.util.Scanner;
public class Main {
//public means class can be accesed from anywhere
    public static void main(String[] args)
    {
       // System.out.println("hello world");
        //taking input
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        System.out.println(input.nextInt());

    }
}

