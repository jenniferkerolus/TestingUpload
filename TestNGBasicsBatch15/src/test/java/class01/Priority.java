package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 3)
    public void aTest() {
        System.out.println("I am test a");
    }

    @Test(priority = 2)
    public void bTest() {
        System.out.println("I am test b");
    }

    @Test(priority = 0)
    public void cTest() {
        System.out.println("I am test c");
    }
}
