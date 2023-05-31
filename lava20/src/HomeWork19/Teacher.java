package HomeWork19;

public class Teacher {
        int ID;
        String name;
        void teaches(){
            System.out.println(name+" teaches 4 topics per class");
        }
        void punishes(){
            System.out.println(name+" lazy students");
        }
        void homework(){
            System.out.println(name+" gives a lot of homework");
        }
        void tests(){
            System.out.println(name+ " gives 2 test per month");
        }
    }
    class MathTeacher extends Teacher{
        String subject;
        String grade;
        void math(){
            System.out.println(subject+"is my favorite subject");
        }
    }

    class ChemistryTeacher extends Teacher{
        int lab;
        int years;
    }
    class PianoTeacher extends Teacher{
        String level;
        void play(){
            System.out.println("music class for "+level);
        }
    }

