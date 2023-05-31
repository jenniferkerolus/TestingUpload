package HomeWork16;

public class Task3 {
    private static String getOnlyVowels(String inputStr){
        return inputStr.replaceAll("[^AEIOUYaeiouy]","");
    }

    public static void main(String[] args) {
        System.out.println(getOnlyVowels("Jennifer"));
    }
}
