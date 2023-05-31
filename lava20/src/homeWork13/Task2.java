package homeWork13;

public class Task2 {
    public static void main(String[] args) {
        String str = "Jenniferkerolus:21/10";
        System.out.println(str.replaceAll("[^A-Za-z0-9)]",""));
        String alpha=str.replaceAll("[^A-Za-z0-9]","");
        int count=0;
        for (int i = 0; i < alpha.length(); i++) {
            count++;

        }
        System.out.println("Total of Alphanumeric is "+count);

        }
    }

