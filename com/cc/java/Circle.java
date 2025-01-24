package com.cc.java;

public class Circle extends SShape{

    private double radius;
   // Constructor
     public Circle(double radius) {
        this.radius = radius;
    }
   
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    

}
