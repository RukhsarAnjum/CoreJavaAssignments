package com.learning.org;

import java.util.Scanner;
import java.lang.Math;

public class AllProgram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

//----------Accept two numbers and do swapping without using third variable-----------------------

//        System.out.println("enter first number");
//        int num1=sc.nextInt();
//        System.out.println("Enter second number");
//        int num2=sc.nextInt();4
//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;
//        System.out.println("number after swapping"+ num1 +" "+num2);

//-------------------------------------------------------------------------------------------------------
//------ WAP to accept 5 subject marks from user and print average and find the grades----------

//        System.out.println("Enter 5 subject marks");
//        int sub1=s.nextInt();
//        int sub2=s.nextInt();
//        int sub3=s.nextInt();
//        int sub4=s.nextInt();
//        int sub5=s.nextInt();
//
//        int avg=(sub1+sub2+sub3+sub4+sub5)/5;
//        System.out.println("Average is"+avg);
//        if(avg>=90){
//            System.out.println("Grade is A");
//        }
//        else if(avg>=70){
//            System.out.println("Grade is B");
//
//        }
//        else if(avg<70){
//            System.out.println("Grade is C");
//
//        }
//        else{
//            System.out.println("Grade is D");
//
//        }

//-------------------------------------------------------------------------------------------------------
// -------------------------------------------greater/smaller--------------------------------------------

//        System.out.println("Enter first number");
//        int num1=s.nextInt();
//
//        System.out.println("Enter second number");
//        int num2=s.nextInt();
//        if(num1>num2){
//            System.out.println(num1+" "+"is greater than"+" "+num2);
//        }
//        else if(num1<num2){
//            System.out.println(num1+" "+"is less than"+" "+num2);
//
//        }


//-------------------------------------------------------------------------------------------------------
//-Accept a number and check is it single digit ,two digits ,three digits ,four digit or more than 4 digits

//      System.out.println("Enter a number");
//       int n=s.nextInt();
//       int sum=0;
//       int count=0;
//        while(n!=0) {
//           sum = sum + n%10;
//           n = n / 10;
//          count++;
//       }
//       System.out.println("The given number is " +count +" "+"digit number");

//------------------------------------------------------------------------------------------------------
//WAP to accept order details from user if order amount is greater than Rs.1500/- then apply discount of 15% on total amount
//eg.
//   Enter quantity of laptops (Rs.300) :4
//   Enter Quantity of USB (Rs.50): 0
//   Enter Quantities of Keyboard(Rs.20): 4

//      Total Amount :-
//      Discount is applicable? :- true or false
//      discount:-
//      After discount amount:- ---------

 //       System.out.println("Enter quantity of laptop");
//        int lap_qty=s.nextInt();
//        int total_price_laptop=lap_qty*300;
//        System.out.println("laptop total  "+total_price_laptop);
//
//        System.out.println("Enter quantity of USB");
//        int usb_qty=s.nextInt();
//        int total_price_usb=usb_qty*50;
//        System.out.println("USB total  "+total_price_usb);
//
//        System.out.println("Enter quantity of Keyboard");
//        int kb_qty=s.nextInt();
//        int total_price_key=usb_qty*20;
//        System.out.println("Keyboard total  "+total_price_key);
//
//        int total_price=total_price_laptop+ total_price_usb +total_price_key;
//        System.out.println("total price is"+total_price);
//        if(total_price>1500){
//            System.out.println("Discount is applicable");
//            double discount_price=  total_price-(total_price*0.15);
//            System.out.println("After discount  "+ discount_price);
//
//        }
//        else {
//            System.out.println("Discount is not applicable");
//        }

//------------------------------------------------------------------------------------------------------
//------Accept a four digit number and print
//   4567
//   4000+500+60+7 = 4567
//   Addition of digits = 22 -----------------------------------

//        System.out.println("Enter a number");
//        int n=s.nextInt();
//        int m =n;
//        int sum=0;
//        int count=0;
//        while(n!=0) {
//            sum = sum + n%10;
//            n = n / 10;
//            count++;
//        }
//        System.out.println("Number is " +sum);
//        System.out.println("Count is" +count);
//        int number =0;
//        while(count>0){
//
//            number = (int)(m/Math.pow(10,count-1));
//            if(count==1)
//                System.out.print(number*(int)(Math.pow(10,count-1)));
//            else
//                System.out.print(number*(int)(Math.pow(10,count-1))+"+");
//
//            m = m - (int)(number*Math.pow(10,count-1));
//            count--;
//        }
    }
}
