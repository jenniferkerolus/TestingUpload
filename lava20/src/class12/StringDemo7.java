package class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startsWith=str.startsWith("i");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));
        // method changing is when multiple methods are called on the same line
        System.out.println(str.toLowerCase().startsWith("i"));
        System.out.println(str.contains("java"));
    }
}
