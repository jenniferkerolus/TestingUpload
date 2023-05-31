package class18;

public class Test {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.accountNumber=67685444436l;
        b.money=2000;
        b.deposit();
        System.out.println(b.accountNumber);
        System.out.println(b.money);
        Checking c=new Checking();
        c.accountNumber=768665;
        c.money=600;
        c.interest=0;
        c.deposit();
        c.transfer();
        System.out.println(" ---Creating an object of Saving----- ");
        Saving save =new Saving();
        save.accountNumber=7575554;
        save.money=7760;
        save.profit=300;
        save.deposit();
        save.takeProfit();
        System.out.println("----Creating an object of Super savings-----");
        SuperSavings s=new SuperSavings();
        s.profit=1000;
        s.yearSave=2000;
        s.minimumSave=500;
        s.takeProfit();
        s.superSavings();


    }
}
