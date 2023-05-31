package class15;

public class MethodPractice {
    boolean isEven(int number){
        boolean flag;
        if (number%2==0) {
            flag = true;
        }else{
            flag=false;
        }
        return flag;
    }
    boolean isEven1(int number){
        if (number%2==0){
            return true;
        }else{
            return false;
        }
    }
    boolean isEven2(int number){
        return number%2==0;
    }
}
