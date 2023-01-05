package homeWork;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How much of loan are you need");
        int loan= input.nextInt();
        System.out.println("I need to get "+loan+" for my house");
        if (loan<=200000) {
            System.out.println("congratulations you are approved");
        }else{
            System.out.println("you are not approved");
        }

    }
}
