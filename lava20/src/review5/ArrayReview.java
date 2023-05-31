package review5;

public class ArrayReview {
    public static void main(String[] args) {
        int a=10;
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println("Size of the array= "+arr.length);
        // to get all value from the array?
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        String []colors={"Black","White","Red","Blue"};
        // anytime we have arrays we can use enhanced for loop
        for(String color:colors){
            System.out.println(color);
        }
        System.out.println("----printing in reverse-----");
        for (int i = colors.length-1; i >=0; i--) {
            System.out.print(colors[i]+" ");


        }
    }
}
