package com.company;

import java.util.Scanner;

public class armstrong_numbers {
    public static void main(String[] args) {
        //armstrong number->cube the digits of a number
        // if the sum comes equal to that number than the number is armstrong number
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        System.out.println(isArmstrong(num));

        //checking how many 3 digit armstrong numbers are there
        for(int i=100;i<1000;i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(i+" ");
            }
        }

    }
    static boolean  isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0)
        {
            int rem= n%10 ;//getting the remainder
            n = n/10;//reducing the number by dividing
            sum=sum + rem*rem*rem;
        }
        return sum == original;
    }


}
