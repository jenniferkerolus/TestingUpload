package syntaxreview1;

public class WhatIf {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        String c="Hello";
        String d="Java";

        System.out.println(a+b+d+c);
        System.out.println(a+c+d+b);
        System.out.println(c+d+a+b);
        System.out.println(c+d+(a+b));
    }
}
