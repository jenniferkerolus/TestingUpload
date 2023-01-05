package review2;

public class NestedIf {
    public static void main(String[] args) {
        /*nested if is 1 is statement inside another if statement
        when we have 1 condition that depends on another
         */
        boolean vaccine=true;
        int dose=1;
        if (vaccine){
            System.out.println("how many doses you have");
            if (dose==1) {
                System.out.println("you need another shot");
            }else{
                System.out.println("you are fully vacinated");
            }

        }else{
            System.out.println("I did not get a vaccine");

        }
    }
}
