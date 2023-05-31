package project;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers = new int[5];
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum=sum+numbers[i];
        }

        System.out.println(sum);
    }
}
