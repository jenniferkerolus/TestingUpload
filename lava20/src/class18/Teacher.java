package class18;

public class Teacher {
    String name;
    int id;
    String subject;
    Teacher(String name,int id){
        this.name=name;
        this.id=id;
    }
    Teacher(String name,int id,String subject){
        this(name,id);
        this.subject=subject;

    }
}
