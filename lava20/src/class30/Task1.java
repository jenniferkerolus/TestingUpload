package class30;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer,String> company=new HashMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Facebook");
        company.put(4,"Amazon");
        company.put(5,"TikTok");
        company.put(6,"Insta");
        company.put(7,"Google");
        System.out.println(company.size());
        company.replace(4,"Shell");
        System.out.println(company);
        company.remove(7);
        System.out.println(company);
    }
}
