import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

@Test()
public class SeleniumBasicsTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test(
            description = "TC-01-HomePageMainHeaderTitle"
    )
    public void validateHomePageMainHeader() {
        driver.get("https://www.automationexercise.com/");

        WebElement mainHeader = driver.findElement(By.xpath("(//h1/span)[1]"));

        while(!mainHeader.isDisplayed()){
            System.out.println("Waiting for the element to be displayed...");
        }

        Assert.assertEquals(mainHeader.getText(), "Automation");
    }

    @Test(
            description = "TC-02-RegisterNewUser",
            dependsOnMethods = {"validateHomePageMainHeader"}
    )
    public void registerUser() throws InterruptedException {
        driver.manage().window().maximize();

        //Object waiter for selenium for 10 seconds max
        WebDriverWait waitElement = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Find sign up page button link
        WebElement signUpLink = driver.findElement(By.xpath("//li/a[@href='/login']"));
        signUpLink.click();

        //Find signup button
        String signUpButtonXPath = "//li/a[@href='/login']";
        WebElement signupButton = waitElement.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(signUpButtonXPath))));

        //Type data in the sign-up form
        WebElement signupNameInput = driver.findElement(By.xpath("//form/input[@data-qa='signup-name']"));
        WebElement signupEmailInput = driver.findElement(By.xpath("//form/input[@data-qa='signup-email']"));

        signupNameInput.sendKeys("John Doe");
        signupEmailInput.sendKeys("john.doe.test2@email.com");

        //Register User
        signupButton.click();

        //TODO: Add CORS configuration

        //Wait until Enter Account Information page displays
        String enterAccInfoTitleXPath = "//div[@class='login-form']/h2/b[text()='Enter Account Information']";

        try {
            WebElement enterAccInfoTitle = waitElement.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(enterAccInfoTitleXPath))));
            Assert.assertEquals(enterAccInfoTitle.getText(),"ENTER ACCOUNT INFORMATION");
        }catch (Exception e){
            System.out.println("Cant find ENTER ACCOUNT INFORMATION label");
        }

        try {
            //Validate if the error message is being displayed
            WebElement errorMessageSignUp = driver.findElement(By.xpath("//form/p[text()='Email Address already exist!']"));
            if(errorMessageSignUp.isDisplayed()){
                Assert.fail("Data duplicated");
            }
        }catch (Exception e){
            Assert.fail("Error while creating account information");
        }
    }


}
