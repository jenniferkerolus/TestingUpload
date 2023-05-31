package class30;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> studentMap=new HashMap<>();
        studentMap.put(1,"Nezir");
        studentMap.put(2,"Jennifer");
        studentMap.put(3,"Sam");
        studentMap.put(4,"Judy");
        System.out.println(studentMap);
        System.out.println(studentMap.get(3));
        System.out.println(studentMap.size());
        System.out.println(studentMap.containsKey(4));
        System.out.println(studentMap.remove(1));
        System.out.println(studentMap);
    }
}
