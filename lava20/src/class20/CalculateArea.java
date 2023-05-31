package class20;

public class CalculateArea {
    void areaOfSquare(int l, int w) {
        System.out.println("Area of square is " + l * w);
    }

    void areaOfRectangle(double side) {
        System.out.println("Area of rectangle is " + (side * side));
    }


    public static void main(String[] args) {

        CalculateArea c=new CalculateArea();
        c.areaOfRectangle(10);
        c.areaOfSquare(10,12);
    }
}