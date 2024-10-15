package AutomationExerciseTestNG.Test;

import AutomationExerciseTestNG.Utilities.BrowserUtils;
import AutomationExerciseTestNG.pages.LoginPage;
import AutomationExerciseTestNG.pages.homePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    homePage homePage = new homePage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void homeTest() {


        loginPage.login();

        //calışma yapılacak
    }

}
