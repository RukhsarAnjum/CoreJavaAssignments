package com.learning.org;

import java.util.ArrayList;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        int i=0;
//        for(;i<=10;){
////            if(i>10){
////                break;
////            }
//            System.out.println("value is "+i);
//            i++;
//        }
        //-----------------------------------------------------------
//        for(int i=10;i>=0;i--){
//            System.out.println("Reverse value is "+i);
//        }

        //---------------------------------for each loop-----------------------
//        String name[]={"Rukhsar","Anjum","Salim","Ahmad"};
//        for(String str:name){
//            System.out.println(str);
//        }

        //----------------------------for each for string------------------------
//        String s="Rukhsar anjum";
//        for(char ch:s.toCharArray()){
//            System.out.println(ch);
//        }

        //---------------------------for each for integer-------------------------
//        int n[]={1,2,3,4,5,7,8,};
////        for(int n:i){
////            System.out.println(n);
////        }
//
//        for(int i=1;i<=n.length;i++){
//            System.out.println(i);
//        }

 //----------------------palindrome number-------------------------
        Scanner s= new Scanner(System.in);
        for(int n=1;n<=100;n++){
            int flag=0;
            for (int i = 2; i <= n/ 2; ++i) {
                // condition for non-prime number
                if (n % i == 0) {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.print( n + " ");
            }

        }


//        if (flag==0)
//            System.out.println(num + " is a prime number.");
//        else
//            System.out.println(num + " is not a prime number.");

//        ArrayList<Integer> a=new ArrayList<>();
//        for(int n=1; n<=100; n++){
//            int c = 0;
//            for (int i = 1; i <= n; i++)
//                if (n % i == 0)
//                    c++;
//            if (c == 2)
//                a.add(n);
//            else
//                continue;
//        }
//        System.out.println(a);
    }

