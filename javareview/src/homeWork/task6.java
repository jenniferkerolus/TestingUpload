package homeWork;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have an account credit card?");
        boolean creditCard=input.nextBoolean();
        System.out.println("What is the balance on your credit?");
        int balance=input.nextInt();
        if (creditCard) {
            System.out.println("What is the balance on it");
            if (balance>1000) {
                System.out.println("you have to pay it off now ");
            }else {
                System.out.println("you can spend more");
            }
            }else{
            System.out.println("lets open a credit card");

            }

        }


    }

