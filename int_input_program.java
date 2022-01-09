package com.company;

import java.util.Scanner;

public class int_input_program {
    public static void main(String[] args) {
        //taking input from keyboard
       Scanner input=new Scanner(System.in);
//        System.out.println("please enter some input: ");
//        int rollno=input.nextInt();
//        System.out.println("you roll number is "+ rollno);

        //inputting string
        String name=input.nextLine();
        System.out.println(name);
        //inputting float value
        float value=input.nextFloat();
        System.out.println(value);

    }



}
