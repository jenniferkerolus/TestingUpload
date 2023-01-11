package class5;

public class SwitchCaseDemo4 {
    public static void main(String[] args) {
        char gender='F';
        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
