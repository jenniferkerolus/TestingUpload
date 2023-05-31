package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.switchTo().frame(0);
      WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
      textBox.sendKeys("kerolus");
      driver.switchTo().defaultContent();
      WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println(text.getText());
        driver.switchTo().frame("frame_a");
        WebElement getLabel= driver.findElement(By.xpath("//label"));
        System.out.println(getLabel.getText());

    }
}
