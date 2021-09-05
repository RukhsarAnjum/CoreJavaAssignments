package com.learning.org;

public class Circle extends Shape {
    private double area;

    public Circle(double radius)
    {
        super(radius);
    }

    public void getArea(){
        System.out.println("Area "+3.14 *getRadius());

    }
}
