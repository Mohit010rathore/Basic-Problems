package com.company;

import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
 //       Scanner in = new Scanner(System.in);
//        String fruit = in.next();

        //to convert switch statement into new syntax(ALT+Enter)
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }

//        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }

        //NESTED SWITCH
        Scanner in=new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();

        switch (empID) {
            case 1:
                System.out.println("Mohit Rathore");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CSE":
                        System.out.println("Cse department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("input right employee id");
                break;
        }

    }
}
