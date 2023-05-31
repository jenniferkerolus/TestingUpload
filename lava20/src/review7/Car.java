package review7;

public class Car {
    String make, model;
    int year, horsePower;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    Car(String make, String model, int year, int horsePower) {
        this(make, model);//making call to the current class constructor
        this.year = year;//accessing current class instance variables
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println(make + " Starts");
    }

    public void drive(int speed) {
        System.out.println(make + " dives with speed " + speed);
    }

    void drive(String destination) {
        System.out.println(make + " drives to " + destination);
    }

    void drive(int speed, String destination){
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }
    void drive(String destination,int speed){
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }

}