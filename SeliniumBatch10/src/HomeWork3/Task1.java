package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkBoxBtn=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        Thread.sleep(3000);
        boolean isSelectedBtn=checkBoxBtn.isSelected();
        if(!isSelectedBtn) {
            checkBoxBtn.click();
        }
        isSelectedBtn=checkBoxBtn.isSelected();
        Thread.sleep(3000);
        driver.quit();
    }
}
