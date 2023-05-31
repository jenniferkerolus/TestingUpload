package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] arr={10,20,30,39,40};
        addArrayElementsMachine(arr);
        int [] arr1={20,130,34,23,60};
        addArrayElementsMachine(arr1);
    }
    static  void addArrayElementsMachine(int [] arr){
        int sum=0;
        for (int number:arr) {
            sum+=number;
        }
        System.out.println(sum);
    }
}
