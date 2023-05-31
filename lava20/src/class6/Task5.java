package class6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Please enter three numbers");
        num1=scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();
        if (num1>num2&&num1>num3) {
            System.out.println("The largest number is " + num1);
        }else if (num2>num1&&num2>num3) {
            System.out.println("The largest number is " + num2);
        }else if (num3>num1&&num3>num2){
            System.out.println("The largest number is "+num3);
        }
    }
}
