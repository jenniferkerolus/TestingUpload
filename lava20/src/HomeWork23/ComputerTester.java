package HomeWork23;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple(),new HP(),new Lenovo(),new Dell()};
        for(Computer computer:computers){
            computer.version();
            computer.storage();
            computer.processor();
        }
    }
    }

