package class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        System.out.println("line 6");
        try {
            // here we put the code which might throw an error
            System.out.println(10/0);
          //  int[] arr=new int[-5];
          /*  String name = null;
            System.out.println(name.length());*/
        }catch (NullPointerException npe){
            System.out.println("We are trying to access a method on a null object");
        }catch (ArithmeticException e){
            System.out.println("Some one is trying to divide by 0");
        }
        catch (Exception e){
            System.out.println("Something wet wrong");
        }
        System.out.println("line 7");
        System.out.println("line 8");
        System.out.println("line 9");
    }
}
