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
}