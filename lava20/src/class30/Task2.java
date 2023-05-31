package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap();
        countries.put("Egypt","Cairo");
        countries.put("USA","Washington");
        countries.put("Italy","Rome");
        countries.put("France","Paris");

        //Set<Map.Entry<String, String>> entrySet = countries.entrySet();
        var entrySet= countries.entrySet();

        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        for (String country : countries.keySet()) {
            String capital = countries.get(country);
            System.out.println(country + " - " + capital);
        }
        var iterator=countries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry =iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
