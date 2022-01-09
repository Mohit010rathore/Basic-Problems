package com.company;

import java.util.Scanner;

public class counting_occurences {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
        int n= 232488783;

        int count=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            if(rem==4)
            {
                count++;
            }
            n=n/10; //if not 5 again divide and get the remainder
        }
        System.out.println(count);
    }
}
