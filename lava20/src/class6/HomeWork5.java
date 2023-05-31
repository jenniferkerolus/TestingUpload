package class6;

public class HomeWork5 {
    public static void main(String[] args) {
        int num = 20;
        while (num <= 50) {
            if (num % 2 == 1) {
                System.out.println(num);
                num += 2;
            }
        }
        System.out.println("******");
        while (num <= 50) {
            if (num % 2 != 0) {
                System.out.println(num);
                num++;
            }
        }
    }
}


