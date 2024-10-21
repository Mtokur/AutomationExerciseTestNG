package AutomationExerciseTestNG.pages;

import AutomationExerciseTestNG.Utilities.BrowserUtils;
import AutomationExerciseTestNG.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import AutomationExerciseTestNG.Utilities.ConfigurationReader;
import org.testng.Assert;

import static org.testng.Assert.*;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signupLoginButton;
    @FindBy(xpath = "//input[@data-qa='login-name']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailBox;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement signupButton;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    public void login() {
        BrowserUtils.waitFor(2);
        signupLoginButton.click();
        emailBox.sendKeys(ConfigurationReader.get("email"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        signupButton.click();


    }

    public void logimForAll(String userName, String email, String password) {

        signupLoginButton.click();
        nameBox.sendKeys(userName);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);


    }


    }



