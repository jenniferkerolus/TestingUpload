package class25;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble[] moveAbles={new Car(),new Dog()};
        for(MoveAble m:moveAbles){
            m.move();
            OwnAble[] ownAbles={new Car(),new Dog()};
            for (OwnAble o:ownAbles){
                o.own();
            }
        }
    }
}
