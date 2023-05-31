package HomeWork28;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i <=500; i+=2) {
                numbers.add(i);
            }

        numbers.removeIf(i ->(i%5==0) );
        System.out.print(numbers);
    }

}
