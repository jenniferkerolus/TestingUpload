package review2;

public class IfElseIf {
    public static void main(String[] args) {
        /* When we have more conditions to test
        if (boolean condition){
        code A;
        }else if (boolean condition){
        code c;
        }

         */
        int homeWork=20;
        if (homeWork>25) {
            System.out.println("you did a great job");
        }else if (homeWork<=20) {
            System.out.println("you did a good job");
        }else if (homeWork>10) {
            System.out.println("you did ok");
        }else if (homeWork>5){
            System.out.println("you did not do ok");
        }
String browser="OPera";
        if (browser.equals("chrome")) {
            System.out.println("test cases executed on chrome browser");
        }else if (browser.equals("firefox")) {
            System.out.println("test cases executed on firefox browser");
        }else{ //when none of the conditions are true
            System.out.println("browser is not supported");

        }
    }
}
