package com.learning.org;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
//        int i=0;
//        while(i<=10){
//            System.out.println("The value of i is "+i);
//           i++;
//            i+=2;
//        }
//----------------------------------------------------
//        int i=10;
//        while(i>=0) {
//            System.out.println("The value of i is " + i);
//            i--;
//        }
 //----------------------------------------------------------------
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Number of iteration");
        int n=s.nextInt();
        while(n>=0){
            sum+=n;
            n--;
        }
        System.out.println("sum is "+sum);

    }
}
