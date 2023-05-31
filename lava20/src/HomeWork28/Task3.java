package HomeWork28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Apple");
        words.add("Cat");
        words.add("Orange");
        words.add("Milk");

        words.removeIf(w -> w.endsWith("e"));
        System.out.println(words);
    }
}
