package com.learning.org;

class MyCustomException extends Exception{
    public MyCustomException(String str){
     super(str);
    }
    public void myMessage(){
        System.out.println("My message is called");
    }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        try{
            throw new MyCustomException("MyCustomMessage");
        }
        catch(MyCustomException e){
            System.out.println(e.getMessage());
            e.myMessage();
        }
    }
}
