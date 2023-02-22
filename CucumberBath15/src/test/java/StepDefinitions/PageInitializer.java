package StepDefinitions;

import Pages.AddEmpPage;
import Pages.LoginPage;

public class PageInitializer {
    public static  LoginPage login;
    public static AddEmpPage addEmployeePage;
    public static void initializePageObjects(){
        login =new LoginPage();
        addEmployeePage=new AddEmpPage();
    }
}
