package homeWork;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your city");
        String city=input.nextLine();
        System.out.println("Enter the temperature");
        double temperatureF= input.nextDouble();
        System.out.println("The temperature in "+city+" is" +" "+ (temperatureF-32)*5/9);

    }
}
