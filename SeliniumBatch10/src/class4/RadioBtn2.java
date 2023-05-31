package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtn2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        List<WebElement> radioBtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radiobtn:radioBtns){
            String age= radiobtn.getAttribute("value");
            if(age.equalsIgnoreCase("0 - 5")){
                radiobtn.click();
            }
        }

    }
}
