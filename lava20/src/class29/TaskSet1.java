package class29;

import java.util.TreeSet;

public class TaskSet1 {
    public static void main(String[] args) {
        TreeSet<String> country=new TreeSet<>();
        country.add("USA");
        country.add("Italy");
        country.add("France");
        country.add("Spain");
        country.add("Egypt");
        System.out.println(country);
        for (String c:country){
            System.out.println(c);
        }
    }
}
