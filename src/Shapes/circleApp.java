package Shapes;

import util.Input;


public class circleApp {


    public static void main(String[] args){
        Input input = new Input();

        System.out.println("Enter a number: ");
        double radius = input.getDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle.getRadius());
        System.out.println(circle.getCircumference());


    }
}
