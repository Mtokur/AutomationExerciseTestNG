package AutomationExerciseTestNG.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    LoginPage loginPage=new LoginPage();

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBox;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;
    @FindBy(xpath =" //div[@ class='radio-inline'][1]")
    public WebElement maleRadioButton;
    @FindBy(xpath = "//input[@data-qa='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//body[@style='padding: 0px;']")
    public WebElement googleCheckbox;
    @FindBy(id = "days")
    public WebElement dayBox;
    @FindBy(id = "months")
    public WebElement monthBox;
    @FindBy(id = "years")
    public WebElement yearBox;
    @FindBy(xpath="//input [@name='newsletter']")
    public WebElement newsletterCheckBox;
    @FindBy(id="optin")
    public WebElement optinCheckBox;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyBox;
    @FindBy(xpath = "//input[@name='address1']")
    public WebElement address1Box;
    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2Box;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryBox;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateBox;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityBox;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCodeBox;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumberBox;
    @FindBy(xpath = "// button[text()='Create Account']")
    public WebElement createAccountButton;
    @FindBy(xpath = "//b[text()='Create Account']")
    public WebElement createAccountButton2;
    @FindBy(xpath = "(//a[@data-qa='continue-button'])")
    public WebElement continueButton;
    @FindBy(xpath = "//i[text=' Logged in as ")
    public WebElement loggedInAs;
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;






    public void register(String name, String email) {

        loginPage.signupLoginButton.click();
        nameBox.sendKeys(name);
        emailBox.sendKeys(email);
        signupButton.click();

    }
}
