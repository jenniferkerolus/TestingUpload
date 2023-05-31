package HomeWork30;

import java.util.Map;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {
        Map<Integer,Person> persons=new TreeMap<>();
        persons.put(155,new Person("Jennifer","Kerolus",34,70000));
        persons.put(156,new Person("Judy","Gamal",32,80000));
        persons.put(157,new Person("Bob","Smith",25,50000));
        var entrySet=persons.entrySet();
        for(var entry:entrySet){
            System.out.println("User ID "+entry.getKey());
            entry.getValue().printInfo();
        }

    }
}
