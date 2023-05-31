package review5;

public class TwoDArray2 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3},
                {11, 12},
                {20, 21, 22},
                {100, 101}};
        for (int row = 0; row < array.length ; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row%2!=0){
                    System.out.println(array[row][col]+" ");
                }
                System.out.println();
            }
            System.out.println("''''''''''''''''");


        }

    }
}
