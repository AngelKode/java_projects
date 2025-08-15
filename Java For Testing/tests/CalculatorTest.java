import org.testng.Assert;
import org.testng.annotations.*;

@Test()
public class CalculatorTest {

    @BeforeClass
    public void setUpTestEnv() throws InterruptedException {
        System.out.println("Setting up test environment...");
        Thread.sleep(2000);
        System.out.println("Setting up test environment finished.");
    }

    @BeforeMethod
    public void setUpTestMethod() {
        System.out.println("Setting up test method...");
    }

    @AfterMethod
    public void closingTestMethod() {
        System.out.println("Closing test method...");
    }

    @AfterClass
    public void tearDownTestEnv() throws InterruptedException {
        System.out.println("Tearing down test environment...");
        System.out.println("Closing selenium object...");
        Thread.sleep(2000);
        System.out.println("Test env finished successfully!");
    }

    @DataProvider
    public Object[] testArrayData(){
        return new Object[][]{
            new Integer[]{1,2,3,48}, new Integer[]{1,2,3,4},
        };
    }

    @Test(
            testName = "TC-01 Happy Path",
            description = "TC to validate happy path",
            priority = 1,
            dataProvider = "testArrayData")
    public void testEqualArraySize(Integer[] data){
        Assert.assertEquals(new Integer[]{1,2,3,48}.length,data.length);
    }

    @Test(
            dependsOnMethods = {"testEqualArraySize"},
            description = "TC for regression",
            testName = "TC-02 Regression Test")
    @Parameters({"dataExample"})
    public void testSameDataArray(@Optional("Default data") String dataExample){
        System.out.println(dataExample);
        System.out.println("testEqualArraySize completed successfully!");
        Assert.assertEquals(true,true);
    }
}
