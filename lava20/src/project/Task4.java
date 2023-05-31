package project;

public class Task4 {
    public static void main(String[] args) {
        int[][] evenOdd={{1,2,3,4,10,12},{6,7,8,9,14,16}};
        for (int i = 0; i < evenOdd.length ; i++) {
            for (int j = 0; j < evenOdd[i].length; j++) {
                if (evenOdd[i][j]%2==0){
                    System.out.println(evenOdd[i][j]+" ");
                }

            }
            
        }
    }
}
