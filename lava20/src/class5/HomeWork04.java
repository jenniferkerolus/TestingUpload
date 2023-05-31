package class5;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String birthMonth= input.nextLine();
        if (birthMonth.equals("January")||birthMonth.equals("February")||birthMonth.equals("March")) {
            System.out.println("You were born in Winter");
        }else if (birthMonth.equals("April")||birthMonth.equals("May")) {
            System.out.println("You were born in Spring");
        }else if (birthMonth.equals("June")||birthMonth.equals("July")||birthMonth.equals("August")) {
            System.out.println("You were born in Summer");
        }else{
            System.out.println("You were born in Fall");
        }
    }
}
