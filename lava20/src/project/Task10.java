package project;

public class Task10 {
    public static void main(String[] args) {

        int[] number = {100, 50, 20, 40, 23, 34, 60};
        int firstLarge=number[0];
        int secondLarge=number[1];
        for (int i = 2; i < number.length; i++) {
                if (number[i] > firstLarge) {
                    secondLarge = firstLarge;
                    firstLarge = number[i];
                }else if (number[i]>secondLarge && number[i]!=firstLarge){
                    secondLarge=number[i];
                }
            }
        System.out.println("The second largest number is " +secondLarge);
    }
}

