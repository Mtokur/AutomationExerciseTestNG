package AutomationExerciseTestNG.Test;

import AutomationExerciseTestNG.Utilities.BrowserUtils;
import AutomationExerciseTestNG.Utilities.ConfigurationReader;
import AutomationExerciseTestNG.Utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    // We added for Extent Reports
    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpReport(){
        // This will initialize ExtentReports Class
        report = new ExtentReports();

        // Create a report path --> how can we find our project dynamically
        String projectPath = System.getProperty("user.dir");
        // Which folder and file we want to add our reports
        String path = projectPath+"/test-output/report.html";

        // Initialize the HTML report with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        // Attach the HTML Report to the report object
        report.attachReporter(htmlReporter);

        // We need to give a title to our report
        htmlReporter.config().setReportName("Audit3 Smoke Suit");

        // Set environment information --> Test name, Tester name, Browser, Test Steps (Admin/User), Test Data, Date and Time, Operating System...
        report.setSystemInfo("Environment","Production");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("Operating System",System.getProperty("os.name"));
        report.setSystemInfo("Test Engineer","mehmettokur");
    }
    @AfterTest
    public void tearDownReport(){
        // This is when the report is actually created
        report.flush();
    }

    @BeforeMethod
    public void setUp(){
        driver = Driver.get();
        driver.get(ConfigurationReader.get("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,15);
    }
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        // If test is failed
        if (result.getStatus()==ITestResult.FAILURE){// test is failing
            // Record the name of the failed test
            extentLogger.fail(result.getName());

            // Take the screenshot and return its location
            String screenshotPath = BrowserUtils.getScreenshot(result.getName());

            // Add the screenshot to the report
            extentLogger.addScreenCaptureFromPath(screenshotPath);

            // Capture the exception and put inside the report
            extentLogger.fail(result.getThrowable());
        }

        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
    }
