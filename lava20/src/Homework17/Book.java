package Homework17;

public class Book {
    String subject;
    String name;
    int year;
    Book(String subject,String name){
        this.subject=subject;
        this.name=name;
    }
    Book(String subject,String name,int year){
        this(subject,name);
        this.year=year;
    }
    void printInfo(){
        System.out.println(subject+" name "+name+" year "+year);
    }

    public static void main(String[] args) {
        Book b=new Book("Story","Aligator",2018);
        b.printInfo();

    }


}
