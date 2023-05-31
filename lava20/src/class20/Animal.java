package class20;

public class Animal {
    String name;
    String color="Black";
}
class Cat extends Animal{
    String color="white";
    int age;
    double weight;
void printColor(){
    String color="Blue";
    System.out.println(super.color);
    System.out.println(this.color);
    System.out.println(color);
}
}
class AnimalTester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.printColor();
    }
}
