package HomeWork33;

public class Task4 {
    public static void checkUser(String name){
        if(name.length()<5){
            System.out.println(new RuntimeException("The username should be more than 5 characters"));
        }else{
            System.out.println("Login");
        }
    }
    public static void main(String[] args) {
        String name="Jeny";
        try{
            checkUser(name);
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
