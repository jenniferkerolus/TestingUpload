package HomeWork30;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(19);
        num.add(25);
        num.add(12);
        num.add(70);
        num.add(100);
        int sum=0;
        for(Integer n:num) {
            sum += n;
        }
            System.out.println(sum);
        }
    }

