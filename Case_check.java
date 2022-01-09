package com.company;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
        System.out.println(ch);

//        .trim()->removes extra spaces
//        .charAt()->is returning a character type
        if(ch>='a' && ch<='z')
        {
            System.out.println("lowecase");
        }else{
            System.out.println("uppercase");
        }

    }
}
