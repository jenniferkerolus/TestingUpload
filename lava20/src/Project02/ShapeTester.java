package Project02;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(10),new Square(5)};
        for(Shape s:shapes){
            s.calculateArea();
            s.calculatePerimeter();
        }
        }
    }

