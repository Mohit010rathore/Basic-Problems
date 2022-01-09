package com.company;

import java.util.Scanner;

public class condition_and_loops {
    public static void main(String[] args) {
        /* syntax of if statement
          if(boolean expression T or F){
                //body
          }else{
              //do this
          }

        */
        // FOR LOOPS->when you know how many times the loop is going to run
        //Q:Print prime numbers from 1 to 5
//        for(int i = 1; i <= 5; i++)
//        {
//            System.out.println(i);
//        }

        //Print numbers from 1 to n
//        Scanner input=new Scanner(System.in);
//        int n=input.nextInt();
//        for(int i = 1; i <= n; i++)
//        {
//            System.out.println(i +" ");
//        }

        //WHILE LOOP->when you dont know how many times the loop is going to run
//        int num=1;
//        while(num<=5)
//        {
//            System.out.println(num);
//            num++;
//        }
        //DO-WHILE->the loop will going to execute at least once
        int n=1;
        do{
            System.out.println(n);
        }while(n!=1);

    }
}
