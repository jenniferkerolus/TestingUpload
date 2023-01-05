package class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money=15000;
        if (money>1000) {
            System.out.println("lets buy an iphone ");
        }
        if (money>2000){
            System.out.println("lets also buy a macbook");
            boolean motherDay=true;
            if (motherDay) {
                System.out.println("Happy mothers day");
                String name = "Sardar"; // equals method is only used for non-primitive
                if (name.equals("Sardar")) {
                    System.out.println("I love football");
                }

            }
        }
    }
}
