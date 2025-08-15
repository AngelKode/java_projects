import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test()
public class CalculatorTest {
    @DataProvider
    public Object[] testArrayData(){
        return new Object[][]{
            new Integer[]{1,2,3,48}, new Integer[]{1,2,3,4},
        };
    }

    @Test(
            testName = "Same length array",
            description = "This test validates if the expected array has the same length than the others",
            singleThreaded = true,
            priority = 1,
            dataProvider = "testArrayData")
    public void testEqualArraySize(Integer[] data){
        Assert.assertEquals(new Integer[]{1,2,3,48}.length,data.length);
    }

    @Test(dependsOnMethods = {"testEqualArraySize"})
    public void testSameDataArray(){
        System.out.println("testEqualArraySize completed successfully!");
        Assert.assertEquals(true,true);
    }
}
