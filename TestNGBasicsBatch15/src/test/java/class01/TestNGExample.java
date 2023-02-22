package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGExample {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void SetupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterTest(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }

    @Test(groups="regression")
    public void LoginFunctionality() {
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        // we can use * instead of the tag name "input" as shortcut
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginBtn.click();
    }

    @Test
    public void PasswordTextBoxVerification() {
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        System.out.println(password.isDisplayed());
    }
}
