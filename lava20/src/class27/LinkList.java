package class27;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList linky = new LinkedList();
        linky.add("Rob");
        linky.add("Alex");
        linky.add("Jose");
        linky.remove();
        System.out.println(linky);

        LinkedList<Integer> link = new LinkedList<Integer>();
        link.add(5);
        link.add(34);
        link.add(2);
        System.out.println(link.get(1));
        Iterator it =link.iterator();
        while(it.hasNext()){
            if ((int)it.next()==34){
                System.out.println("We found 34");
            }
        }
    }
}

