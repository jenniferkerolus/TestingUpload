package Class2;

public class Variables {
    public static void main(String[] args) {
        int box1 = 10;
        /*n below line is reserving a box in the computers memory.
        we are calling it box1 if we need the information that we are storing inside this box we can simple say to the computer give us the contents of box1.
        int=> what type of data we want to store
        box1=> is the name of the box
         */
        // if we are printing something from a box we don't need ""
        System.out.println(box1);// bring the contents of box1

        //to store whole numbers(numbers without decinols points)  we have 4 different types of boxes.
    byte box2=127; // range for byte is from 128 to 127 if we need to store larger number
        byte box3=-128;
        short box4=32767;
        int biggerBox=12345678; //most common type of box
        long maxBox=1532347219L;
        short myBox=10000;
        System.out.println(myBox);




    }

    public static class Class2 {
    }
}
