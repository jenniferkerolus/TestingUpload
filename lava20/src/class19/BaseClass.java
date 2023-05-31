package class19;

public class BaseClass {
    String name = "John";

    void hello() {
        System.out.println("Hello method from BaseClass ");
    }
}
class Child extends BaseClass{
    String name="Jane";
    void callMe(){
        System.out.println(name);// print Jane
        System.out.println(super.name);// print John
    }
    void hello(){
        System.out.println("Hello method from child");
    }
    void callingParentMethod(){
        hello();
        super.hello();
    }
}
