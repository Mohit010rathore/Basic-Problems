package com.company;

import java.util.Scanner;

public class largest_among {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        //Find the largest of three numbers
      int max=a;
        if(b>max)
        {
            max=b;
        }if(c>max)
        {
            max=c;
        }
        System.out.println(max);

          //or
//        int max=Math.max(c,Math.max(a,b));
//        System.out.println(max);

    }
}
