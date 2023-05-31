package class8;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your item ");
        String item= scanner.nextLine();
        System.out.println("Enter the item price");
        double price= scanner.nextDouble();
        System.out.println("Your total is "+price);
        System.out.println("Enter money given");
        double money=scanner.nextDouble();
        if (money<price) {
            System.out.println("Please you need to pay " + (price - money));
        }else{
            System.out.println("Your change is "+(money-price));

        }
        System.out.println("Thanks for shopping");

    }
}
