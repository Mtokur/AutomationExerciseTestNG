package AutomationExerciseTestNG.Test;

import AutomationExerciseTestNG.Utilities.BrowserUtils;
import AutomationExerciseTestNG.pages.LoginPage;
import AutomationExerciseTestNG.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import AutomationExerciseTestNG.Utilities.Driver;


public class RegisterTest extends TestBase {
   /* 1. Launch browser
2. Navigate to url 'http://automationexercise.com'
 3. Verify that home page is visible successfully(
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible(egister test1 ile yapıldı.)
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
            11. Select checkbox 'Receive special offers from our partners!'
            12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
            14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button  */
 LoginPage loginPage=new LoginPage();
RegisterPage registerPage=new RegisterPage();
   @Test
    public void registerTest() {
    System.out.println(driver.getTitle());
    String expectedTitle = "Automation Exercise";
    String actalTitle = driver.getTitle();
    Assert.assertEquals(expectedTitle, actalTitle, "Title verification failed");
    registerPage.register("mehmet123", "4mehmet123@gmail.com");
    BrowserUtils.waitFor(2);
    String Expected = "ENTER ACCOUNT INFORMATION";
    String actual = driver.findElement(By.tagName("h2")).getText();
    Assert.assertEquals(actual, Expected, "Url verification failed");
    registerPage.passwordBox.sendKeys("12345!");
    registerPage.maleRadioButton.click();
    ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", registerPage.dayBox);
    BrowserUtils.waitFor(3);
    registerPage.dayBox.sendKeys("1");
    registerPage.monthBox.sendKeys("1");
    registerPage.yearBox.sendKeys("1990");
    ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", registerPage.newsletterCheckBox);
    BrowserUtils.waitFor(3);
    registerPage.newsletterCheckBox.click();
    registerPage.optinCheckBox.click();
    registerPage.firstNameBox.sendKeys("mehmet");
    registerPage.lastNameBox.sendKeys("met");
    registerPage.companyBox.sendKeys("iş");
    registerPage.address1Box.sendKeys("aksaray");
    ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", registerPage.address2Box);
    BrowserUtils.waitFor(3);
    registerPage.address2Box.sendKeys("adana");
    registerPage.countryBox.click();

    registerPage.stateBox.sendKeys("Türkiye");
    registerPage.cityBox.sendKeys("adana");
    registerPage.zipCodeBox.sendKeys("33");
    registerPage.mobileNumberBox.sendKeys("2222222217");
    registerPage.createAccountButton.click();
    String Expected1 = "ACCOUNT CREATED!";
    BrowserUtils.waitFor(2);
    String actual1 = driver.findElement(By.tagName("h2")).getText();
    Assert.assertEquals(actual1, Expected1, "Url verification failed");
    ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", registerPage.continueButton);
    BrowserUtils.waitFor(3);
    registerPage.continueButton.click();


       }

   }



