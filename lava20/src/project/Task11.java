package project;

public class Task11 {
    public static void main(String[] args) {
        String[] arr={"Judy","Sam","Jennifer","Diana","Peter","Jennifer"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1+i; j < arr.length ; j++) {
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[j]);
                }

            }

        }
    }
}
