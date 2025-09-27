package UI;
import org.testng.annotations.*;

@Test()
public class BasicTestNG {

    @Test(
        dataProvider = "dbDataProvider",
        dataProviderClass = BasicTestDataProvider.class
    )
    public void dbTestingLogging(String dbName, int dbPassword, int dbPort) {
        System.out.println("Running test...");
        System.out.println("Connecting to database " + dbName);
        System.out.println("With password " + dbPassword);
        System.out.println("With port " + dbPort);
    }

    //Lazy Data provider test
    @Test(
        dataProvider = "login-users-data",
        dataProviderClass = BasicTestDataProvider.class,
        priority = 1
    )
    public void loginTest(String username) {
        System.out.println("Running test for user: " + username);
    }

    //Lazy Data provider with multiple params
    @Test(
            dataProvider = "login-users-all",
            dataProviderClass = BasicTestDataProvider.class,
            priority = 2
    )
    public void loginTest(int age, String country, boolean isMember, String status) {
        System.out.println("Running test with user with age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Is member: " + isMember);
        System.out.println("Status: " + status);
    }
}