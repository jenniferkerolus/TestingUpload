package project;

public class Task3 {
    public static void main(String[] args) {
     int[][] numbers={{40,42,44},{45,47,49}};
     int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];

            }

        }
        System.out.println(sum);
    }
}
