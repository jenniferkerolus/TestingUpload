package review6;

public class MoreStringMethods {
    public static void main(String[] args) {
        String myString="Today is February 2";
       String[] strArray =myString.split(" ");
       for (String s:strArray){
           System.out.println(s);
          String newStr =myString.substring(9);
          myString.substring(9,17);
           System.out.println(newStr);
          int index=newStr.indexOf('b');
           System.out.println(index);

       }
    }
}
