package Homework17;

public class Employee {
    String name;
    int age;
    double weight;
    double height;
    private Employee(String sName, int sAge, double sWeight, double sHeight){
        name=sName;
        age=sAge;
        weight=sWeight;
        height=sHeight;
    }
    public Employee(String sName, double sWeight, double sHeight, int sAge){
        name=sName;
        weight=sWeight;
        height=sHeight;
        age=sAge;
    }
    protected Employee(String sName, double sWeight, int sAge, double sHeight) {
        name = sName;
        weight = sWeight;
        age = sAge;
        height = sHeight;
    }
    Employee(double sWeight, double sHeight, int sAge, String sName){
        weight=sWeight;
        height=sHeight;
        age=sAge;
        name=sName;
    }
    void printInfo(){
        System.out.println("Name is "+name+" have "+age+" years and weight is "+weight+" height "+height);
    }

    public static void main(String[] args) {
        Employee profile=new Employee("Jennifer",35,140.0,5.5);
        profile.printInfo();
        Employee profile1=new Employee("Jen",30,135.5,5.2);
        profile1.printInfo();
        Employee profile2=new Employee("Judy",32,137.6,5.1);
        profile2.printInfo();
        Employee profile3=new Employee("Danny",36,155.7,6.5);
        profile3.printInfo();
    }
}
