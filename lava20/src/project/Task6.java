package project;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Befor swaping a= "+a+" and b= "+ b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a= "+a+" and b= " + b);
    }
}

