package homeWork;
import java.util.Scanner;


public class task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How old are you");
        int age=input.nextInt();
        if (age>18) {
            System.out.println("You will get your driver license");
        }else{
            System.out.println("You will get just permit now ");
        }
    }
}
