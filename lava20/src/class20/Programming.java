package class20;

public class Programming {
    void programming(){
        System.out.println("I love programming language");
    }
    void programming(String name){
        System.out.println("I love "+name);
    }

    public static void main(String[] args) {
        Programming p=new Programming();
        p.programming();
        p.programming("Java");
    }
}
