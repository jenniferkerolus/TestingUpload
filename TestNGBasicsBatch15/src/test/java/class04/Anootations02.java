package class04;

import org.testng.annotations.*;

public class Anootations02 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @BeforeMethod
    public void before() {
        System.out.println("I am before Method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("I am after class");
    }
    @AfterMethod
    public void after() {
        System.out.println("I am after Method");
    }
    @Test
    public void TestA() {
        System.out.println("I am test A");
    }
     @Test
    public void TestB() {
        System.out.println("I am test B");
    }
}
