package com.learning.org;

abstract class Shape{
    private String color;
    abstract public double area();  //abstract method
    public Shape(String color){
        System.out.println("Parameterised constructor of Shape is called");
        this.color=color;
    }

    public String getColor(){
        return color;
    }
}


class Circle extends Shape{

    private double radius;
    public Circle(String color,double radius){
        super(color);
        System.out.println("Parameterised constructor of Circle is called");
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color,double length,double width) {
        super(color);
        System.out.println("Parameterised constructor of Rectangle is called");
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}


public class AbstractExample {
    public static void main(String[] args) {
        Shape s1=new Circle("RED",2.2);
        System.out.println("AREA OF CIRCLE:- "+s1.area());
        System.out.println(s1);
        System.out.println("************************************");
        s1=new Rectangle("Blue",2,4);
        System.out.println("AREA OF Rentangle:- "+s1.area());
        System.out.println(s1);


    }
}


