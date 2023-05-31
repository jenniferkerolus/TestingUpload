package HomeWork30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<String> str=new LinkedHashSet<>();
        str.add("I");
        str.add("Love");
        str.add("Study");
        str.add("Java");
        for (String s:str){
            System.out.print(s+" ");
        }
    }
}
