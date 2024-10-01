package AutomationExerciseTestNG.pages;

import AutomationExerciseTestNG.Utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import AutomationExerciseTestNG.Utilities.ConfigurationReader;

import static org.testng.Assert.*;

public class homePage {
    @FindBy(xpath = "//a[text()=' Logged in as 'and @b='username']")
    public WebElement loggedInAsBox;
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOutButton;
    @FindBy(xpath = "//a[text()='Delete Account']")
    public WebElement deleteAccountButton;
    @FindBy(xpath = "//a[text()='Edit Account']")
    public WebElement editAccountButton;
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//a[text()=' About Us']")
    public WebElement continueButton;

    public WebElement verifyLoggedInAsBox() {
        BrowserUtils.waitForVisibility(loggedInAsBox, 5);
        BrowserUtils.waitForClickablility(loggedInAsBox, 5);
        Assert.assertTrue(loggedInAsBox.getText().contains(ConfigurationReader.get("username")));


        return loggedInAsBox;
    }
}
