package homeWork13;

public class Task6 {
    public static void main(String[] args) {
        String first = "Jennifer";
        String last = "Kerolus";
        System.out.println("The String before swap is first= "+first+" last= "+last);
        first=first+last;
        last=first.substring(0,first.length()-last.length());
        first=first.substring(last.length());
        System.out.println("The String after swap is first= "+first+" last= "+last);


    }
}
