package class25;

public interface MoveAble {
void move();
}
interface OwnAble{
    void own();
}
class Car implements MoveAble,OwnAble{
public void move(){
    System.out.println("I can move");
}
public void own(){
    System.out.println("you can own me");
}
}
class Dog implements MoveAble,OwnAble{
    public void move(){
        System.out.println("I can move");
    }
    public void own(){
        System.out.println("you can own me");
    }
}