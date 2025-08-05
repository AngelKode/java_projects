package classes_inheritance;

public class Square implements Shape{
    private final double sideLength;

    Square(double sideLength){
        this.sideLength = sideLength;
    }
    @Override
    public double area() {
        return this.sideLength * this.sideLength;
    }

    @Override
    public double perimeter() {
        return this.sideLength * 4;
    }
}
