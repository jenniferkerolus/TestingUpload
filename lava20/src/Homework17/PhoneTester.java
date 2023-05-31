package Homework17;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone=new Phone("Iphone","Blue",2.5,2013);
        phone.printInfo();

        Phone phone1=new Phone();
        phone1.name="Samsung";
        phone1.color="Black";
        phone1.weight=3.0;
        phone1.year=2015;

        phone1.printInfo();
    }
}
