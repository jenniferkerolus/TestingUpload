package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> tags= driver.findElements(By.tagName("a"));
       // in order to print we need to iterator
        for(WebElement tag:tags){
            String link=tag.getAttribute("href");
            System.out.println(link);
        }

    }
}
