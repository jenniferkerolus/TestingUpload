package homeWork12;

public class Task1 {
    public static void main(String[] args) {
        String str=new String("HelloWorld!");
        System.out.println("String Length:"+str.length());
        for (int i = 0; i <=str.length(); i++) {
            if(!str.isEmpty()) {
                if (i % 2 != 0 && i >= 3) {
                    int middle = str.length() / 2;

                    System.out.println(str.charAt(middle));
                    break;
                }
            }
        }


    }
}
