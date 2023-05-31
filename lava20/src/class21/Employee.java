package class21;

public class Employee {
    String name;
    int baseSalary=30000;
    int baseHolidays=10;
    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }
}
class OfficeBoy extends Employee{

}
class Manager extends Employee{
    void printSalary(){
        System.out.println((baseSalary*4)+20000);
    }

}
class Developer extends Employee{
    void printSalary(){
        System.out.println((baseSalary*5)+300000);
    }
    class QA extends Employee{
        void printSalary(){
            System.out.println((baseSalary*2)+30000);
        }
        void printHolidays(){
            System.out.println(baseHolidays+5);
        }
    }
}
