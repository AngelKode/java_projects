package UI;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

    @DataProvider(
        name = "login-users-data"
    )
    public static Iterator<String> dataLoginUsers() {
        //Create the object of the items and its own iterator
        List<String> userProfiles = List.of("user-john","user-maria","user-pepe");

        return userProfiles.iterator();
    }

    @DataProvider(
        name = "login-users-all"
    )
    public static Iterator<Object[]> dataLoginUsersAll() {
        //Create the object of the items and its own iterator
        Object[][] usersProfileData = {
            {25, "MEX", true, "ONLINE"},
            {21, "USA", true, "DISCONNECTED"},
            {45, "MEX", false,"BUSY"},
            {19, "ENG", false,"OFFLINE"}
        };

        return Arrays.stream(usersProfileData).iterator();
    }
}
