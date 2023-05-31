package homeWork12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is dad's first name?");
        String dadName=scanner.next();
        System.out.println("What is Mom's first name?");
        String momName=scanner.next();
        System.out.println("What do you expecting boy or girl?");
        String gender=scanner.next();
        String boy= "DANRY";
        String girl= "MAIEL";
        if(dadName.equals("Daniel") && momName.equals("Mary")){
            if (gender.equals("boy")) {
                System.out.println("Suggested name is " + boy);
            }else if(dadName.equals("Daniel") && momName.equals("Mary")){
                if (gender.equals("girl")){
                    System.out.println("Suggested name is "+girl);
                }
            }
        }
    }
}
