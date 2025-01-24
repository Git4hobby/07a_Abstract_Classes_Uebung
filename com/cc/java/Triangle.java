package com.cc.java;

public class Triangle extends SShape{
    
    private double base;
    private double height;
    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() { 
         return base * height / 2;
         // Beispiel: gleichseitiges Dreieck
        //  return 3 * base;
    }
    
    
}
