package Homework17;

public class Students {
    String name;
    int englishGrade;
    int mathGrade;
    int sinceGrade;
    Students(String sName,int sEnglish,int sMath,int sSince) {
        name = sName;
        englishGrade = sEnglish;
        mathGrade = sMath;
        sinceGrade = sSince;
    }
    void printInfoS(){
        int average=(englishGrade+mathGrade+sinceGrade)/3;
        System.out.println("Student name "+name+" average score is "+average);

    }
}
