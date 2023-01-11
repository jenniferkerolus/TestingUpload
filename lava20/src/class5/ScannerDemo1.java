package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] argus){
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        /*
        Scanner => name of the class
        scan is just a variable like we create primitive variables
        ==> assignment operator
        System.in=> tells the computer we want to read from keyboard
         */
        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("you are "+age+" years old");
        System.out.println("Please enter your weight");
        double weight= scanner.nextDouble();
        System.out.println("your weight is "+weight);
        System.out.println("Are you hungry");
        boolean hungry= scanner.nextBoolean();
        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(0);
        System.out.println("your gender is "+gender);
    }
}
