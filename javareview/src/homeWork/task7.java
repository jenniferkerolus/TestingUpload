package homeWork;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many years did you work?");
        int workYears=input.nextInt();
        System.out.println("How much is your salary?");
        int salary=input.nextInt();

        if (workYears>=5) {
            System.out.println("you are eligible for bonus");
            if (salary>50000) {
                System.out.println("you will get bonus 5000" );
            } else if (salary<50000) {
                System.out.println("you will get bonus 3000");

        }
        }else{
            System.out.println("you are not eligible");

        }
    }
}
