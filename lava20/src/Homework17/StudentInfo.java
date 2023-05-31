package Homework17;

public class StudentInfo {
    String name;
    String address;
    StudentInfo(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name is "+name+" and address "+address);
    }

    public static void main(String[] args) {
        StudentInfo info=new StudentInfo("Jennifer","1234 Pump Rd");
        info.displayInfo();
    }
}
