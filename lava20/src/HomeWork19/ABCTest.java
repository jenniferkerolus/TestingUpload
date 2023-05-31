package HomeWork19;

public class ABCTest {
    public static void main(String[] args) {

        A test = new A();
        test.country = "USA";
        test.capital="Washington";
        test.printF();

        System.out.println("***********");

        B test1=new B();
        test1.country="USA";
        test1.capital="Washington";
        test1.size=10988887;
        test1.printF();
        test1.use();

        System.out.println("********************");

        C test2=new C();
        test2.country="USA";
        test2.capital="Washington";
        test2.size=10988887;
        test2.language="English";
        test2.printF();
        test2.use();
        test2.sound();


    }
}