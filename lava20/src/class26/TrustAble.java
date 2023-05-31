package class26;

public interface TrustAble {
    int age=10;
    String color ="blue";
    int trust();
    static void method1(){
        System.out.println("Hello world");
    }
    default void method2(){

    }
}
class BankOfAmerica implements TrustAble{
    public int trust(){
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}