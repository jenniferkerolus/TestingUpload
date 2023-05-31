package HomeWork30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(766676, "TV");
        bestBuy.put(786655, "Printer");
        bestBuy.put(876654, "LabTop");
        bestBuy.put(87765,"Iphone");

        var entrySet=bestBuy.entrySet();
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}