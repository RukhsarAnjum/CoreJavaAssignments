package com.learning.org;

import java.util.Scanner;

public class SwitchCaseExample {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1] Addition \n2] Subtraction \n3] Multiplication \n4] Division \n\n\n Enter choice:");
        int choice=s.nextInt();

        System.out.println("Entre first number");
        int num1=s.nextInt();

        System.out.println("Entre second  number");
        int num2=s.nextInt();

        switch (choice){
            case 1:
                System.out.println("Addition" + (num1 + num2));
            break;

            case 2:
                System.out.println("Subtraction" +(num1-num2));
            break;

            case 3:
                System.out.println("Multiplication" +(num1*num2));
            break;

            case 4:
                System.out.println("Division" +((float)(num1)/(float)num2));
            break;

            default:
                System.out.println("Wrong choice");



        }
    }
}
