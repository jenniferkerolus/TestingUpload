package HomeWork22;

public class CreditCard {
    int balance=10000;
    double interest=2.5;

    public CreditCard(double interest,int balance) {
        this.interest = interest;
        this.balance=balance;
    }

   public void calculateInterest(){
        System.out.println("Interest "+(balance*interest)/100);
    }
}
class Visa extends CreditCard{
    public Visa(double interest, int balance) {
        super(interest, balance);
    }
}
class AX extends CreditCard{
    public AX(double interest, int balance) {
        super(interest, balance);
    }

    @Override
     public void calculateInterest() {
        System.out.println("Interest"+(balance*interest/100)+30);
    }
}
class CreditTester{
    public static void main(String[] args) {
        CreditCard c=new CreditCard(10,100);
        c.calculateInterest();
        Visa v=new Visa(10,100);
        v.calculateInterest();
        AX interest=new AX(10,100);
        interest.calculateInterest();
    }
}