package class27;

import java.util.ArrayList;

public class ArrayListP {
    public static void main(String[] args) {
        String[] fruits=new String[3];
        fruits[0]="Mango";
        fruits[1]="Apple";
        fruits[2]="banana";
        System.out.println(fruits[1]);

        ArrayList fruitList=new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("banana");
        fruitList.add("lemon");
        fruitList.remove("lemon");
        System.out.println(fruitList.contains("strawberry"));
        System.out.println(fruitList);


    }

}
