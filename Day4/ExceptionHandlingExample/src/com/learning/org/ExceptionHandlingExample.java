package com.learning.org;
//
//public class ExceptionHandlingExample {
//    public static void main(String[] args) {
//
//        try{
//            int arr[]=new int[5];
//            arr[19]=30;
////            System.out.println(arr[6]);
//        }
//
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception 2" +e);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Exception 1 " +e);
//        }
//
//        catch (Exception e){
//            System.out.println("Exception 3" +e);
//        }
//
//        try{
//            String str=null;
//            System.out.println(str.length());
//
//            int a[]={1,2,3,4,5};
//            for(int i=0;i<=a.length;i++){
//                System.out.println(a[i]);
//            }
//        }
//        catch(Exception e){ //generic exeption
//
//            System.out.println("Error : " +e);
//            // System.out.println("Ending block");
//        }
//    }
//}





public class ExceptionHandlingExample
{
    public static void main(String args[])
    {
        try
        {
            System.out.print("Hello world ");
        }
        finally
        {
            System.out.println("Finally executing ");
        }
    }
}

