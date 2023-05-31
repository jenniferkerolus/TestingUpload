package review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][] array={{1,2,3},
                      {11,12,13},
                      {20,21,22}};

        //getting all values from 2D array
        for(int[] arr:array){
            // iterates over arrays
            for (int num:arr){
                //itersts over each elements
                System.out.print(num+" ");
            }
            System.out.println();
        }







        int numberOfArray= array.length;
        System.out.println(numberOfArray);
        int numberOfElementsInArray=array[0].length;
        System.out.println(numberOfElementsInArray);
        int numberOfElementsIn4Array=array[3].length;
        System.out.println(numberOfElementsIn4Array);

    }
}
