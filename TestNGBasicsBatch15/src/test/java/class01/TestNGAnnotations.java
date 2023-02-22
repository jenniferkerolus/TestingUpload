package class01;

import org.testng.annotations.Test;

public class TestNGAnnotations {
    @Test(groups="regression")
    public void bFirstTestCase() {
        System.out.println("I am the first test case");
    }

    @Test
    public void aSecondTestCase() {
        System.out.println("I am the second test case");
    }

    @Test
    public void cThirdTestCase() {
        System.out.println("I am the third test case");
    }
}

