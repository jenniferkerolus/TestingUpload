package project;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 4 countries");
        String[] country = new String[4];
        String[] capital = new String[4];
        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < capital.length; j++) {
                country[i] = scanner.next();
                capital[j] = scanner.next();
                System.out.println("The capital of " + country[i] + " is " + capital[j]);
            }
            System.out.println();
        }
        for (int i=0;i <country.length;i++){
        switch (country[i]){
            case "USA":
                System.out.println("Washington is the capital of"+country[i]);
                break;
            case "Egypt":
                System.out.println("Cairo is the capital of"+country[i]);
                break;
            case "Italy":
                System.out.println("Milano is the capital of"+country[i]);
                break;
            case "France":
                System.out.println("Paris is the capital of"+country[i]);
                break;
            default:
                System.out.println("wrong country");

        }

            }
}
                }

















