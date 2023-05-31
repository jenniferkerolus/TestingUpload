package class17;

public class Students {
    String name;
    int id;
    int age;
    double weight;
    Students(String studentName,int studentId,int studentAge,double studentWeight){
        name=studentName;
        id=studentId;
        age=studentAge;
        weight=studentWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" ID "+id+" Age "+age+" Weight "+weight);
    }

    public static void main(String[] args) {
        Students student1=new Students("Jennifer",1234455,35,140.3);
        student1.printInfo();
        Students student2=new Students("Judy",122334,30,137.4);
        student2.printInfo();
        Students student3=new Students("Sam",123445,37,200.0);
        student3.printInfo();

    }
}
