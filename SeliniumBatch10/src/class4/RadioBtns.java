package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
       driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='male']"));
      boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("the male button is selected "+isSelectedMale);
        if(!isDisplayedMale) {
            maleBtn.click();
           }
            isSelectedMale=maleBtn.isSelected();
            System.out.println("the status of selection is "+isSelectedMale);
        }
    }

