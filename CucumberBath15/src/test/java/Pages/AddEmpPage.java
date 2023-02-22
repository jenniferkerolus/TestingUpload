package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommenMethods;

public class AddEmpPage extends CommenMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimTab;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement eddEmpBtn;

    @FindBy(id="firstName")
    public WebElement firstNameTextBox;

    @FindBy(id="middleName")
    public WebElement middleNameTextBoxBtn;

    @FindBy(id="lastName")
    public WebElement lastNameTextBoxBtn;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

    public AddEmpPage(){
        PageFactory.initElements(driver,this);
    }

}
