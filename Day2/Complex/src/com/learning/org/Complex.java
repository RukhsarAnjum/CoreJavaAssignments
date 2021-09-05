package com.learning.org;

public class Complex {
    private int real;
    private  int img;

    public void showVal(){
        System.out.println("Real " +real+" "+"Imaginary "+img);
    }

    public static void main(String[] args) {
        Complex c1=new Complex();
        c1.showVal();
    }
}
