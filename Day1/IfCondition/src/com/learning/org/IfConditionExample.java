package com.learning.org;

import java.util.Scanner;
import java.lang.Math;



public class IfConditionExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        System.out.println("Enter value for temp");
//        int temp=s.nextInt();
//        if(temp==100){
//            System.out.println("Temp is 100");
//        }
//        else{
//            System.out.println("Temp is not 100");
//        }
//-----------------------------------------positive / negative----------------------------------------------------------
//        if(temp<0){
//            System.out.println("Temp is negative which is" +temp);
//        }
//        else{
//            System.out.println("Temp is positive which is" +temp);
//        }

//--------------------------------even / odd------------------------------------------------------------------
//        if(temp%2==0){
//            System.out.println("Temp is even number");
//        }
//        else{
//            System.out.println("Temp is odd number");
//        }


// -------------ternary operator----------------------------------------------------------------------
//        System.out.println(temp%2==0?"Temp is even":"Temp is odd");



//
//-------------------------------------------------------------------------------------------

//
//----------------------------------------------------------------------------------------------
//
//-----------------------------------------------------------------------------------------------------
//        System.out.println("Enter numbers");
//        int a=s.nextInt();
//        int b=s.nextInt();
//        int c=s.nextInt();
//        int d=s.nextInt();
//        int e=s.nextInt();
//
//
//
//        if(a>=b && a>=c && a>=d && a>=e) {
//            if(a==b) {
//
//            }
//            System.out.println(a+ "is greater than others");
//        }
//        else if(b>a && b>c && b>d && b>e){
//            System.out.println(b+ "is greater than others");
//        }
//        else if(c>a && c>b && c>d && c>e){
//            System.out.println(c+ "is greater than others");
//        }
//        else if(d>a && d>b && d>c && d>e){
//            System.out.println(d+ "is greater than others");
//        }
//        else{
//            System.out.println(e+ "is greater than others");
//
//        }
//--------------------------------------------------------------------------------


        System.out.println("Enter a number");
        int n=s.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("Count is"+count);


    }
}
