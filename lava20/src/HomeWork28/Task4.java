package HomeWork28;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Milk");
        drinks.add("Juice");
        drinks.add("Coffee");
        drinks.add("Tea");

        for (int i = 0; i < drinks.size(); i++) {
            String drink= drinks.get(i);
            if (drink.contains("a")|| drink.contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
