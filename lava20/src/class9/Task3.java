package class9;

public class Task3 {
    public static void main(String[] args) {
        double[] number={10.5,12.0,45,10.5,23,10.5};

        int count=0;
        for (int i = 0; i < number.length ; i++) {
            if (number[i]==10.5){
                count++;
            }

        }
        System.out.println(count);
    }
}
