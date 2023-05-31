package HomeWork29;

import java.util.HashMap;
import java.util.HashSet;

class Student{
    private String name;
    private int ID;
    public Student(String name,int ID){
        this.name=name;
        this.ID=ID;
    }
    public String getName(){
        return name;
    }

    public int getID() {
        return ID;
    }
}
public class Task2 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet();
        students.add(new Student("Daniel", 1234));
        students.add(new Student("Leo", 1236));
        students.add(new Student("Cris", 1239));
        students.add(new Student("Ella", 1238));
        ;

        }
    }


