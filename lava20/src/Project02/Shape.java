package Project02;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    int radius;
    double PI=3.14;
    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The calculate of circle area is "+(radius*radius)*PI);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The calculate of circle perimeter is "+(2*PI)*radius);

    }
}
class Square implements Shape{
    int side;
    Square(int side){
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println("The calculate of area is "+(side*side));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The calculate of perimeter is "+(4*side));
    }
}