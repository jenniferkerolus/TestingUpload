package class5;

import java.util.Scanner;

public class HomeWork08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your grade");
        char grade=input.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println('A'+" is Excellent");
                break;
            case 'B':
                System.out.println('B'+" is Good");
                break;
            case 'C':
                System.out.println('C'+" is Average");
                break;
            case 'D':
                System.out.println('D'+" is Bad");
                break;
            default:
                System.out.println("Not acceptable");
        }

    }
}
