package homeWork13;

public class Task5 {
    public static void main(String[] args) {
        String str="JAVA";
        String reversed=new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("This String is a palindrome");
        }else{
            System.out.println("Is not a palindrome");
        }
        }

        }

