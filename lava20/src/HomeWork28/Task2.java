package HomeWork28;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Nissan");
        cars.add("Honda");
        cars.add("Toyota");

        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("-----------");

        for(String car:cars){
            System.out.println(car);
        }
    }
}
