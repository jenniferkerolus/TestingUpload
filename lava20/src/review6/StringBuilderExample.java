package review6;

public class StringBuilderExample {
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("Hello");
       sb.reverse();
        System.out.println(sb);
        String str=sb.toString();
        str.toUpperCase();
        System.out.println(str);

    }
}
