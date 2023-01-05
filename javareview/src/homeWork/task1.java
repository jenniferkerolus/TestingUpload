package homeWork;

public class task1 {
    public static void main(String[] args) {
        boolean diploma=true;
        double gpa=3.5;

        if (diploma) {
            System.out.println("congratulations");
            if (gpa>=3.5) {
                System.out.println("you are eligible for scholarship");
            }else{
                System.out.println("you should study harder");
            }
        }else{
            System.out.println("you should get a degree");

        }

    }
}
