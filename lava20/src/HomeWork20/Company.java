package HomeWork20;

public class Company {
    public static void main(String[] args) {
        Employee e=new Employee("Dillard's","Beauty advisor",1223445);
        e.printInfo();

        FullTime f=new FullTime("Dillard's","Beauty advisor",123445,5,70000);
        f.Details();

        PartTime p=new PartTime("Dillard's","Beauty advisor",123445,25);
        p.Info();

    }
}
