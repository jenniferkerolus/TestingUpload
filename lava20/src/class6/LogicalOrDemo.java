package class6;

public class LogicalOrDemo {
    public static void main(String[] args) {
        String day="Monday";
        if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");
        }else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class enjoy");
        }else if(day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing");

        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("Wrong day entered");

        }
    }
}
