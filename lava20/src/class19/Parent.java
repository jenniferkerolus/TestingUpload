package class19;

public class Parent {
    String name;
    static String lastName;
    Parent(){
        System.out.println("I am a parent class constructor");
    }
    public void hello(){
        System.out.println("public method hello from parent class ");
    }
    protected static void bye(){
        System.out.println();
    }
    private void money(){
        System.out.println("privat method hello from parent class");
    }
}
