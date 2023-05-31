package class18;

public class Furniture {
    String type;
    double price;
    String color;
    //with the help of constructor we can initialize object with specific value
    Furniture(String type,double price,String color){
        this.type=type;
        this.price=price;
        this.color=color;

    }
    void print(){
        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
