package class9;

public class HomeWork6 {
    public static void main(String[] args) {
        String [] country={"USA","Egypt","Italy","France","England"};
        for (int i = 0; i < country.length; i++) {

                    switch (country[i]){
                        case "USA":
                            System.out.println("Washington is the capital of USA");
                            break;
                        case "Egypt":
                            System.out.println("Cairo is the capital of Egypt");
                            break;
                        case "Italy":
                            System.out.println("Milano is the capital of Italy ");
                            break;
                        case "France":
                            System.out.println("Paris is the capital of France");
                            break;
                        case "England":
                            System.out.println("London is the capital of England");
                            break;
                        default:
                            System.out.println("Invalid");

                    System.out.println(country[i]);
            }

        }

    }
}
