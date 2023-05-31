package class8;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your start and end point range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("start point ="+start+" end point ="+end);
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <= end; i++) {
            if (i%2==0){
                evenSum+=1;
            }else{
                oddSum+=1;
            }

        }
        System.out.println("Sum of the even numbers "+evenSum);
        System.out.println("Sum of the odd numbers "+oddSum);



        }


        }






