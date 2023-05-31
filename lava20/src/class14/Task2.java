package class14;

public class Task2 {
    public static void main(String[] args) {
        String str="jhbhgghj212(*&^^";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());

    }
}
