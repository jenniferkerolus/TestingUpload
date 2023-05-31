package Project02;

public abstract class Car {
    double carPrice;
    String color;

    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}
class Sedan extends Car {
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    double calculateSalePrice() {
        double discount = (carPrice * 5) / 100;
        double discount1 = (carPrice * 10) / 100;
        if (length > 20) {
            System.out.println("The sale price of Sedan " + color + " is $" + discount);
            return discount;
        } else {
            System.out.println("The sale price of Sedan " + color + " is $" + discount1);
            return discount1;

        }
    }
}

    class Truck extends Car {
        double weight;

        Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        double calculateSalePrice() {
            double discount = (carPrice * 10) / 100;
            double discount1 = (carPrice * 20) / 100;
            if (weight > 2000) {
                System.out.println("The sale price of Truck " + color + " is $" + discount);
                return discount;
            } else {
                System.out.println("The sale price of Truck " + color + " is $" + discount1);
                return discount1;
            }
        }
    }


