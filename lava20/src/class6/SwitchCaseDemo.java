package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country="USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Cool Dogs");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("kebab");
                break;
            default:
                System.out.println("wrong country");


        }
    }
}
