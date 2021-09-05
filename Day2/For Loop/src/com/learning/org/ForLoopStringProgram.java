package com.learning.org;

import java.util.Scanner;

public class ForLoopStringProgram {
    public static void main(String[] args) {
        //----------------------------------string----------------------------------

//        String message="JAVA programming";
//        String reversedString="";
//        int i=message.length()-1;
//        do{
//            reversedString+=message.charAt(i);
//            i--;
//        }while (i>=0);
//
//        System.out.println("Reversed String "+reversedString);

        //-----------------------------------------------------------------------------
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=s.nextLine();
        String replaceString="";
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='a'){
                replaceString+='#';
            }
            else{
                replaceString+=str.charAt(i);
            }
            i++;
        }
        System.out.println(replaceString);

        //-----------------------------------palindrome string---------------------------------------
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter a string");
//       String str=s.nextLine();
//        String reversedString="";
//        int i=str.length()-1;
//        do{
//            reversedString+=str.charAt(i);
//            i--;
//        }while (i>=0);
//        if(str.equals(reversedString)){
//            System.out.println("String is palindrome");
//        }
//        else{
//            System.out.println("String is not palindrome");
//        }
    }
}
