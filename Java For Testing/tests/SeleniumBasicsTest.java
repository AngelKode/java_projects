import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

@Test()
public class SeleniumBasicsTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        //Set page load strategy
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

        //Bypass CORS error
        chromeOptions.addArguments("--disable-web-security");

        driver = new ChromeDriver(chromeOptions);
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
        String signUpButtonXPath = "//button[@data-qa='signup-button']";
        WebElement signupButton = waitElement.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(signUpButtonXPath))));

        //Type data in the sign-up form
        WebElement signupNameInput = driver.findElement(By.xpath("//form/input[@data-qa='signup-name']"));
        WebElement signupEmailInput = driver.findElement(By.xpath("//form/input[@data-qa='signup-email']"));

        signupNameInput.sendKeys("John Doe");
        signupEmailInput.sendKeys("john.doe.test2@email.com");

        //Register User
        signupButton.click();

        //Wait until Enter Account Information page displays
        String enterAccInfoTitleXPath = "//div[@class='login-form']/h2/b[text()='Enter Account Information']";

        try {
            //Validate if we get to the enter account information page
            WebElement enterAccInfoTitle = waitElement.until(
                    driver -> {
                        return driver.findElement(By.xpath(enterAccInfoTitleXPath));
                    }
            );
            Assert.assertEquals(enterAccInfoTitle.getText(),"ENTER ACCOUNT INFORMATION");
        }catch (NoSuchElementException e){
            //If not, that means we cant get to the page
            Assert.fail("Error while creating account information");
        }catch (TimeoutException timeoutException){
            //When title of the page is not being displayed
            Assert.fail("Enter Account label is not being displayed");
        }
    }


}
