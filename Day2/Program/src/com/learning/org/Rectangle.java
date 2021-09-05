package com.learning.org;

public class Rectangle extends Shape {
    private double area;

    public Rectangle(double height,double width){
        super(height,width);
    }

    public void getArea(){
        System.out.println("Area "+getHeight()*getWidth());

    }
}
