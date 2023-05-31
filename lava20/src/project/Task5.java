package project;

public class Task5 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15}};
        int evenSum = 0;
        int oddSum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {

                    evenSum = evenSum + numbers[i][j];
                } else if(numbers[i][j]%2!=0){
                    oddSum = oddSum + numbers[i][j];
                }
            }
        }
                System.out.println("Even number total is " +evenSum);
            System.out.println("Odd number total is "+oddSum);
            }
        }





