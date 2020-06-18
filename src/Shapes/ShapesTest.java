package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Rectangle box1 =  new Rectangle(5,4);
//        Rectangle box2 = new Square(5);
//
//
//
//
//        System.out.println("Box 1");
//        System.out.println("Area: " + box1.getArea());
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("====================");
//        System.out.println("Box 2");
//        System.out.println("Area: " + box2.getArea());
//        System.out.println("Perimeter: " + box2.getPerimeter());


    Measurable myShape = new Square(5,5);
    Measurable myShape1 = new Rectangle(10,15);
        System.out.println("Square");
        System.out.println("Area: " +  myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("=========================================");
        System.out.println("Rectangle");
        System.out.println("Area: " + myShape1.getArea());
        System.out.println("Perimeter: " + myShape1.getPerimeter());
    }

}
