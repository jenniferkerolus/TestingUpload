package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        number1=scanner.nextInt();
        number2= scanner.nextInt();
        number3= scanner.nextInt();
        if (number1>number2){
            if (number1>number3) {
                System.out.println("Number 1 is the largest" + number1);
            }
            }
        if (number2>number1){
            if (number2>number3){
                System.out.println("Number 2 is the largest"+number2);
            }

            }

        if (number3>number1){
            if (number3>number2){
                System.out.println("Number 3 is the largest"+number3);
            }
        }
    }
}
