package com.cc.java;

public class Rectangle extends SShape{

    private double height;
    private double width;
    // Construktor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }
    

    

}






