package com.cc.java;

public class App {
    
    public static void main(String[] args) {
       // Arrays ? :
    //    SShape circle = new Circle( 8.0);
    //    SShape triangle = new Triangle( 7.0, 4.0);
    //    SShape rectangle = new Rectangle(9.0, 9.0); 
       
       Rectangle rectangle = new Rectangle(9.0, 9.0);
        Circle circle = new Circle(8.0);
        Triangle triangle = new Triangle(7.0, 4.0);
       
       
       
       // Output Werte
        output("------ Flächen ------"); 
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());

        // Das geht jetzt nichgt mehr ... Abstraktion
        // SShape sshape = new SShape();
        
        output("------ Differenzen ------");
        output("Diff. r-t :" + areaDiff(rectangle, triangle));
        output("Diff. r-c :" + areaDiff(rectangle, circle));
        output("Diff. c-r: " + areaDiff(circle,rectangle));
        output("Diff. c-t: " + areaDiff(circle, triangle));
        output("Diff. t-t: " + areaDiff(triangle, triangle));

    }

    // 1. Iteration : ggf. 1000x überladen
    // private static double areaDiff(Rectangle r, Triangle t){
    //     return r.area() - t.area();
    // }

    // private static double areaDiff(Rectangle r, Circle c){
    //     return r.area() - c.area();
    // }

    // 2. Iteration: Polymorphie - besser!
    private static double areaDiff(SShape s1, SShape s2){
        return s1.area() - s2.area();
    }

  
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

