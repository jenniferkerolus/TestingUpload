package Homework17;

public class Car {
String model;
int year;
String color;
// Static unable to make static constructor
    Car(String cModel,int cYear,String cColor){
        model=cModel;
        year=cYear;
        color=cColor;
    }
    void printInfo(){
        System.out.println(model+" year "+year+" color "+color);
    }

    public static void main(String[] args) {
        Car c=new Car("Nissan",2012,"Silver");
        c.printInfo();
    }

}
