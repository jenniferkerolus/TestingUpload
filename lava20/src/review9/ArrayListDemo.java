package review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        int size=list.size();
        System.out.println(size);
       int firstElement= list.get(0);
        System.out.println(firstElement);
        list.set(0,120);
        firstElement= list.get(0);
        System.out.println(firstElement);

    }
}
