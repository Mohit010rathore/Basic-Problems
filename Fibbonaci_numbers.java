package com.company;

import java.util.Scanner;

public class Fibbonaci_numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0; //for first element
        int b=1; //for the next element
        int c;
        int count=2;

        while(count<=n){
//            c=a+b;
//            System.out.println(" "+c);
//            a=b;
//            b=c;
//            count++;

            //or for a single answer
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

    }
}