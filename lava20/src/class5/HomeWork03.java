package class5;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int quiz,midTerm,finalScores;
        System.out.println("What is your grades for Quiz,midterm and final scores?");
        quiz= input.nextInt();
        midTerm=input.nextInt();
        finalScores=input.nextInt();
        int grades=quiz+midTerm+finalScores;
        if(grades>=90) {
            System.out.println("Grade A");
        }else if(grades>=70 && grades<90) {
            System.out.println("Grade B");
        }else if (grades>=50 && grades<70) {
            System.out.println("Grade C");
        }else{
            System.out.println("Grade F");
        }
    }
}
