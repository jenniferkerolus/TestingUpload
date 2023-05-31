package project;

public class Task9 {
    public static void main(String[] args) {
        int[] number={10,12,14,3,5,1};
        int minimum=number[0];
        int maximum=number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] >maximum) {
                maximum=number[i];

            } else if (number[i] < minimum) {
                minimum=number[i];
            }
        }
                System.out.println("The maximum number is "+maximum);
                System.out.println("The minimum number is "+minimum);
            }

        }
