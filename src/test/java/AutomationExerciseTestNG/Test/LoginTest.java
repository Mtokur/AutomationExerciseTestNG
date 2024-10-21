package AutomationExerciseTestNG.Test;

import AutomationExerciseTestNG.Utilities.BrowserUtils;
import AutomationExerciseTestNG.Utilities.ConfigurationReader;
import AutomationExerciseTestNG.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage=new LoginPage();

    @Test
    public void loginTest(){
       // loginPage.logimForAll(ConfigurationReader.get("userName"),ConfigurationReader.get("email"),ConfigurationReader.get("password"));

        loginPage.login();
        BrowserUtils.waitFor(1);








    }


}
