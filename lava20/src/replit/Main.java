package replit;


public class Main {

    String name;

    String lastName;
    int age;
    Main(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
}
class Employee extends Main {
    int salary;
    Employee(String name,String lasName,int age,int salary){
        super(name, lasName, age);
        this.salary=salary;
    }
    public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}

class Student extends Main {
    int grade;
    Student(String name,String lastName,int age,int grade){
        super(name, lastName, age);
        this.grade=grade;
    }
    public void details(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Main {
    String seniorActivity;
    Retiree(String name,String lastName,int age,String seniorActivity){
        super(name, lastName, age);
        this.seniorActivity=seniorActivity;

    }
    public void printD(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
class PersorTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Joe", "Smith", 35, 35000);
        employee.printInfo();
        Student student = new Student("Adam", "Smith", 15, 10);
        student.details();
        Retiree retiree = new Retiree("Frank", "Smith", 15, "tour");
        retiree.printD();


    }
}
