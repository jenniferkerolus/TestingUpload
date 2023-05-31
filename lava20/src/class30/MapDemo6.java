package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Gul");
        studentsMap.put(5,"Sam");
        studentsMap.put(6,"Saba");
        studentsMap.put(7,"Jennifer");

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();
        for (Entry<Integer,String>entry:entrySet){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        entrySet.removeIf(x->x.getKey()>2&& x.getValue().contains("i"));






    }
}
