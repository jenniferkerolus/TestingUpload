package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommenMethods;

public class LoginPage extends CommenMethods {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername")
   public WebElement usernameTextBox;
   @FindBy(id="txtPassword")
     public WebElement passwordTextBox;

   @FindBy(id="btnLogin")
  public WebElement loginBtn;

   @FindBy(id="welcome")
    public WebElement welcomeIcon;

   @FindBy(xpath="//a[text()='Logout']")
    public WebElement logoutLink;
}
