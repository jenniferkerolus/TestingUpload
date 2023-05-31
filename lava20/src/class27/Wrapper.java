package class27;

public class Wrapper {
    public static void main(String[] args) {
        int i=10;
        Integer data=new Integer(i);// autoboxing
        System.out.println(data);
        int j;
        j=data.intValue();
        System.out.println(j);// unboxing
    }
}
