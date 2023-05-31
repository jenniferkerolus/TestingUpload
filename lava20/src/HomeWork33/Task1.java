package HomeWork33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            int number= input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Enter all mismatch values");
        }


    }
}
