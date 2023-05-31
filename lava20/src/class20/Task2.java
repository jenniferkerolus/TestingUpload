package class20;

public class Task2 {
    static void method(String str1){
        System.out.println("Method with one string");
    }
    static void method(String str1,String str2){
        System.out.println("Method with two strings");
    }
    static void method(String str1,String str2,String str3){
        System.out.println("Method with three strings");
    }

    public static void main(String[] args) {
        method("java");
        method("python","java");
        method("selenium","java","git");
    }
}
