package homeWork;

public class task2 {
    public static void main(String[] args) {
        int mortgagePrice=300000;
        double mortgageRate=3.1;

        if (mortgageRate>4.5){
            System.out.println("user can not buy the house");
        }else{
            System.out.println("user will buy the house");
            if (mortgagePrice>200000) {
                System.out.println("user needs to apply for loan");
            }else{
                System.out.println("user will pay cash");
            }

        }
    }
}
