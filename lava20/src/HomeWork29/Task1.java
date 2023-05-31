package HomeWork29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Richmond");
        cities.add("FairFax");
        cities.add("Mclean");
        cities.add("Annandale");

        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);



    }
}
