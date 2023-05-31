package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
       String parentWindowHandle =driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        Set<String> windowHandles=driver.getWindowHandles();
        for(String wh:windowHandles){
            driver.switchTo().window(wh);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("")) {
                break;
            }
            }
            System.out.println(driver.getTitle());

        }

    }

