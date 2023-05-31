package HomeWork19;

public class A {
    String country;
    String capital;

    static void printF(){
        System.out.println("The country have multi nationalities");
    }
}
class B extends A{
    int size;
    void use(){
        System.out.println("The size of population ");
    }
}
class C extends B{
    String language;
    void sound(){
        System.out.println("English is the mother language");
    }
}