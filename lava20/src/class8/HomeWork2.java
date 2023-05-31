package class8;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Do you want to apply for a credit card");
            String reply= scanner.next();
            if(reply.equalsIgnoreCase("yes")){
                break;
            }
        }
    }
}
