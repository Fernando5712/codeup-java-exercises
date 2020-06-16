package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 =  new Rectangle(5,4);
        Rectangle box2 = new Square(5);




        System.out.println("Box 1");
        System.out.println("Area: " + box1.getArea());
        System.out.println("Perimeter: " + box1.getPerimeter());
        System.out.println("====================");
        System.out.println("Box 2");
        System.out.println("Area: " + box2.getArea());
        System.out.println("Perimeter: " + box2.getPerimeter());

    }
}
