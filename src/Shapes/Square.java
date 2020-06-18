package Shapes;

public class Square extends Quadrilateral {
    public Square (int length, int width){
        super(length,width);
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
