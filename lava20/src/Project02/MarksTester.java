package Project02;

public class MarksTester {
    public static void main(String[] args) {
        Marks[] mark={new A(90,97,85),new B(99,98,80,85)};
        for(Marks m:mark){
            m.getPercentage();

        }
    }
}
