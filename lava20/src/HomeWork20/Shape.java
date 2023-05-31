package HomeWork20;

public class Shape {
    int radius;
    String name;
    Shape(int radius,String name){
        this.radius=radius;
        this.name=name;
    }
}
class Circle extends Shape{
    double area=(22*radius*radius)/7;
    Circle(int radius,String name) {
        super(radius, name);
    }
        void calculationOfArea(){
            System.out.println("The area of "+name+" is "+area);
        }
    }

