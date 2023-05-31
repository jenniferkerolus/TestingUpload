package class18;

public class BankAccount {
    long accountNumber;
    double money;

    void deposit() {
        System.out.println("Deposit from Bank account class");

    }
}
class Checking extends BankAccount { // child class or sub class or derived class
    double interest;

    void transfer() {
        System.out.println("Transfer from Checking class ");
    }
}
    class Saving extends BankAccount {
        double profit;

        void takeProfit() {
            System.out.println("Profit class from Savings");
        }

    }
    class SuperSavings extends Saving {
    double yearSave;
    double minimumSave;
    void superSavings(){
        System.out.println("Super saving from SuperSavings Class");
    }
    }
