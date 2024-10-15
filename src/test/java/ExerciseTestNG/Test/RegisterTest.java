package ExerciseTestNG.Test;

import ExerciseTestNG.Utilities.ConfigurationReader;
import ExerciseTestNG.Utilities.Driver;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Company;
import com.github.javafaker.Country;
import com.github.javafaker.Faker;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
   /* 1. Launch browser
2. Navigate to url 'http://automationexercise.com'
            3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
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
    Faker faker=new Faker();

   @Test
    public void registerTest() {
       driver.get(ConfigurationReader.get("url"));
       System.out.println(driver.getTitle());
       String expectedTitle = "Automation Exercise";
       String actalTitle = driver.getTitle();
       Assert.assertEquals(expectedTitle, actalTitle, "Title verification passed");
   }



       @Test
    public  void lgnBtn() throws InterruptedException {
           driver.get(ConfigurationReader.get("url"));
           driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
           driver.findElement(By.tagName("h2")).isDisplayed();
           driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(faker.name().firstName());
           driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(faker.internet().emailAddress());
           driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
           Thread.sleep(3000);
       }




       }








