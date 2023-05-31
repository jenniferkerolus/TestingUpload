package class6;

public class HomeWork1 {
    public static void main(String[] args) {
        boolean workDay=true;
        int day=1;
        while (day<5){
            if (workDay) {
                System.out.println("I need a day off");
                day++;
                if (day>6) {
                    workDay = false;

                    System.out.println("I do not need a day off anymore");
                }

            }
        }
    }
}
