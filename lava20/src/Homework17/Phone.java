package Homework17;

public class Phone {
        String name;
        String color;
        double weight;
        int year;
        public Phone(String phoneName, String phoneColor,double phoneWeight,int phoneYear) {
                name = phoneName;
                color = phoneColor;
                weight = phoneWeight;
                year = phoneYear;
        }
        public Phone(){
        }
        void printInfo(){
                System.out.println(name+" color "+color+" weight "+weight+" year "+year);
        }
}
