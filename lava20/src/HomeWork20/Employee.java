package HomeWork20;

public class Employee {
    String company;
    String position;
    int ID;
   public Employee(String company,String position,int ID){
        this.company=company;
        this.position=position;
        this.ID=ID;
    }
    void printInfo(){
        System.out.println("I am working at "+company+" as "+position);
    }
}
class FullTime extends Employee{
    int days;
    int salary;
    FullTime(String company,String position,int Id,int days,int salary){
       super(company,position,Id);
       this.days=days;
       this.salary=salary;
   }
   void Details(){
       System.out.println("Full time job at "+super.company+" working "+days+" days a week and making "+salary+" per year");
   }

        }
        class PartTime extends Employee{
    int hours;
     PartTime(String workName,String position,int ID,int hours){
        super(workName, position, ID);
        this.hours=hours;
    }
    void Info(){
        System.out.println("Part time job at "+super.company+" working only "+hours+" hours per week");
    }
        }
