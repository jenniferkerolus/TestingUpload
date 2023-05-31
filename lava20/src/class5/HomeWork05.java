package class5;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a, b, c;
        System.out.println("Please enter three numbers");
         a= input.nextDouble();
         b= input.nextDouble();
        c= input.nextDouble();
        if (a>b && a>c) {
            System.out.println(a + " is the largest number");
        }else if(b>a && b>c) {
            System.out.println(b + " is the largest number ");
        }else if (c>b&&c>a){
            System.out.println(c+" is the largest number");
        }
    }
}
