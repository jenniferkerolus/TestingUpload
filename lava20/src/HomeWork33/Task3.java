package HomeWork33;

public class Task3 {

    public static void checkAge(int age){
        if (age<16){
            System.out.println(new RuntimeException("You have to be 16"));
        }else{
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args) {
        int age=14;
        try{
            checkAge(age);
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
