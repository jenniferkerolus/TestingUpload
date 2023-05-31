package class5;

import java.util.Scanner;

public class HomeWork09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        char operator;

        System.out.println("Please enter two numbers");
        num1= input.nextInt();
        num2= input.nextInt();
        System.out.println("Enter the operator for calculation");
        operator=input.next().charAt(0);
         switch (operator){
             case '+':
                 System.out.println(num1+num2);
                 break;
             case '-':
                 System.out.println(num1-num2);
                 break;
             case '*':
                 System.out.println(num1*num2);
                 break;
             case '/':
                 System.out.println(num1/num2);
                 break;
             default:
                 System.out.println("Invalid input");

         }
    }
}
