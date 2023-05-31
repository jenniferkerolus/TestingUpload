package HomeWork33;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static  List<Exception> exceptionList(){
        List<Exception> exceptions=new ArrayList<>();
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
            exceptions.add(e);
        }
        try {
            String x="Jen";
            x.charAt(4);
        }catch (StringIndexOutOfBoundsException e){
            exceptions.add(e);
        }
        try{
            String s=null;
            s.isEmpty();
        }catch (NullPointerException e){
            exceptions.add(e);
        }
        try{
            int[] arr={1,2,3};
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            exceptions.add(e);
        }
        return exceptions;
    }

    public static void main(String[] args) {
        List<Exception> list=exceptionList();
        for (Exception e:list){
            System.out.println("Exceptions are "+e.getClass().getName());
        }
    }
}





