package Shapes;

import java.util.Scanner;

public class Circle {
    private double radius;

    Scanner sc = new Scanner(System.in);

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

}

