package UI;

import org.testng.annotations.DataProvider;

public class BasicTestDataProvider {
    @DataProvider(
        name = "dbDataProvider"
    )
    public static Object[][] data() {
        return new Object[][] {
                {"jdbc",12345,8080},
                {"mysql",54321,8081}
        };
    }
}
