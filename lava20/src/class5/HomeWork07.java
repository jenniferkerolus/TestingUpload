package class5;

import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your country");
        String country= input.nextLine();
        switch (country){
            case "Egypt":
                System.out.println("Arabic");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Germany":
                System.out.println("German");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "France":
                System.out.println("French");
            default:
                System.out.println("Wrong country");
        }
    }
}
