package AutomationExerciseTestNG.pages;

import AutomationExerciseTestNG.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public  BasePage() {
    PageFactory.initElements(Driver.get(), this);
}
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public static WebElement signupLoginButton;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public static WebElement nameBox;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public static WebElement emailBox;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public static WebElement signupButton;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passwordBox;
    @FindBy(xpath = "//a[text()='Home']")
    public static WebElement homePage;
    @FindBy(xpath = "//a[text()='Contact Us']")
    public static WebElement contactUsPage;
    @FindBy(xpath = "//a[text()='About Us']")
    public static WebElement aboutUsPage;



}

