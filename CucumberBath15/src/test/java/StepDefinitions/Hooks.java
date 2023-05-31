package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommenMethods;

public class Hooks extends CommenMethods {
    @Before
    public void preCondition(){
        openBrowserAndLaunchApplication();
    }
    //Scenario classes holds the complete information of your tests execution in Cucumber framework
    @After
    public static void postCondition(Scenario scenario){
        byte[] pic;
        if(scenario.isFailed()){
           pic= takeScreenshot("failed/"+ scenario.getName());
        }else{
            pic=takeScreenshot("passed/"+scenario.getName());
        }

        //attach the screenshot in my report
        scenario.attach(pic,"image/png", scenario.getName());

        closeBrowser();
    }

}
