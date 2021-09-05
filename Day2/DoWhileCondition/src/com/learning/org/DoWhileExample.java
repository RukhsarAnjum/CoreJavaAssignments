package com.learning.org;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
//        int i=0;
//        do{
//            System.out.println("value is"+i);
//            i++;
//        }
//        while(i<=10);
        //-------------------------------------------------------------------------------
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1=s.nextInt();
//
//        System.out.println("Enter second number");
//        int num2=s.nextInt();
//         int choice;
//         char ch;
//         do{
//             System.out.println("1] Addition \n2] Subtraction \n3] Multiplication \n4] Division");
//             choice=s.nextInt();
//
//             switch(choice){
//                 case 1:
//                     System.out.println("Addition is "+ (num1+ num2));
//                     break;
//
//                 case 2:
//                     System.out.println("Subtraction is "+ (num1-num2));
//                     break;
//
//                 case 3:
//                     System.out.println("Multiplication is "+ (num1* num2));
//                     break;
//
//                 case 4:
//                     System.out.println("Devision is "+ (float)num1/(float)num2);
//                     break;
//             }
//             System.out.println("Do you want to continue");
//              ch=s.next().charAt(0);
//         }
//         while(ch=='Y'||ch=='y');

        //------------------------------------------
        int i=0;
        do{
            if(i%2==0)
            System.out.println(+i+" "+"even no");
            else
                System.out.println(+i +" "+"odd no");

            i++;
        }
        while(i<=10);
    }
}
