package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDown = driver.findElement(By.xpath("//selsect[@id='select-demo']"));
        Select sel=new Select(dropDown);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.deselectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
    }
}
