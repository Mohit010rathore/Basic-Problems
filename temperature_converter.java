package com.company;

import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the temperature in celcius: ");
        float tempC=input.nextFloat();

        float tempF=(tempC*9/5) + 32;

        System.out.println(tempF);
    }
}
