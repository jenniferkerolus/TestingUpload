package class16;

public class Person {
    private double bankBalance=1250000;
    String address="Street 123";
    public String name="John Snow";
    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("123987766");
    }
    public void printTiktokAccount(){
        System.out.println("user123");
    }
    public static void main(String[] args){
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTiktokAccount();
    }
}
