package HomeWork28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Jennifer");
        names.add("Judy");
        names.add ("Diana");
        names.add("Sam");
        names.add("Peter");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jennifer"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
