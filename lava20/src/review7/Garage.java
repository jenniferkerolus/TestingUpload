package review7;

public class Garage {
    public static void main(String[] args) {
       Tesla c =new Tesla("Tesla","S","electric",2022,340,true);
       c.start();
       c.drive(100);
       c.haveAutopilot();
       c.drive("Miami");

    }
}
