package class25;
public interface WashAble{
    void wash();
}
 class SmartWatch implements WashAble {
    public void wash() {
        System.out.println("you can wash this smartwatch with out any issues");
    }
}
class Phone implements WashAble {
    public void wash() {
        System.out.println("I am IP65 Rated yo can wash me ");
    }

}
class Inverter implements WashAble{
    public void wash(){
        System.out.println("I am IP65 Rated yo can wash me ");
    }
}