package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
// open up fb.com
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Jennifer");
        driver.findElement(By.name("pass")).sendKeys("Kerolus");
        driver.findElement(By.linkText("creat new account")).click();
        driver.findElement(By.partialLinkText("password")).click();
        driver.quit();
    }
}
