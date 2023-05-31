package Project02;

public class CarTester {
    public static void main(String[] args) {
        Car[] cars={new Sedan(25000.00,"Black",25.5),new Truck(20000.00,"White",2000)};
        for (Car c:cars){
            c.calculateSalePrice();
        }

    }
}
