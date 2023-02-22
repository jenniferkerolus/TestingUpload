package class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login() {
        System.out.println(6 / 0);
    }

    @Test
    public void DashBoardVerify() {
        System.out.println("jhsgga");
    }
}
