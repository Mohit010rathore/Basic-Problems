package com.company;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        isPrime(n);
    }

    static void isPrime(int n) {
        int isprime=n;
        boolean prime=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);

    }

}
