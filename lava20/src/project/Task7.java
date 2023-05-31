package project;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your number");
        int number= scanner.nextInt();
        boolean prime=false;
        for (int i = 2; i <=number/2 ; i++) {
            if(number%i==0){
                prime=true;
                break;
            }

        }
           if(!prime){
               System.out.println(number+" is a prime number");
           }else{
               System.out.println(number+" is not a prime number");
           }

    }
}
