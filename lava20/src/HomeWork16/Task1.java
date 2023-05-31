package HomeWork16;

public class Task1 {
    int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        System.out.println(task1.sumArray(new int[]{10,20,30}));
    }
}
