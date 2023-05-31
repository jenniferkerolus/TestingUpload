package HomeWork30;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> salary=new HashMap<>();
        salary.put("John Smith",100000);
        salary.put("Peter Sorial",95000);
        salary.put("Daniel Peter",50000);
        salary.put("Jennifer Kerolus",90000);

        var employee=salary.entrySet();
        int highestSal=0;
        String name="";
        for (var entry:employee){
            if(entry.getValue()>highestSal){
                highestSal= entry.getValue();
                name= entry.getKey();
            }
        }
        System.out.println(name+" =$"+highestSal);

    }
}
