package com.learning.org;

public class Shape {
    private double height;
    private double width;
    private double radius;

    public Shape(){
        System.out.println("Default constructor of shape is called");
        height=0;
        width=0;
        radius=0;
    }

    public Shape(double height, double weight) {
        this.height = height;
        this.width = width;

    }

    public Shape(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }



}
