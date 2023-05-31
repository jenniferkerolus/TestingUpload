package homeWork13;

public class Task4 {
    public static void main(String[] args) {
       // String str = "I want to do my Replit";
       // for (int i = str.length() - 1; i >= 0; i--) {
         //   System.out.print(str.charAt(i));

            //StringBuilder st = new StringBuilder("I want to do my Replit");
            //  System.out.println(st.reverse());
            // String str= st.toString();
            String str = "I want to do my Replit";
        String[] arr = str.split(" ");
            for (String word : arr) {
                System.out.print(new StringBuilder(word).reverse()+" ");
                }
                System.out.print(" ");
            }
        }




