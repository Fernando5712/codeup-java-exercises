package Shapes;

public class Square extends Rectangle{
    public Square( int side) {
        super(side,side);
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return 4 * width;
    }
}
