package class30;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("Mascara",30.0);
        makeup.put("Foundation",70.0);
        makeup.put("blush",40.0);
        //to get all the keys we can use keySet method from Map interface
        Set<String> allKey=makeup.keySet();
        System.out.println(allKey);
        //for (String s:allKey){
          //  System.out.println(s);
        allKey.removeIf(x->x.length()>7);
        System.out.println(allKey);
        System.out.println(makeup);
        }
        //delete all the entries from the map for which the size of key is greater than 7

    }

