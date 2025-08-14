import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test()
public class CalculatorTest {
    @DataProvider
    public Object[] testArrayData(){
        return new Object[][]{
            new Integer[]{1,2,3,48}, new Integer[]{1,2,3},
        };
    }

    @Test(dataProvider = "testArrayData")
    public void testEqualArraySize(Integer[] data){
        Assert.assertEquals(new Integer[]{1,2,3,48}.length,data.length);
    }
}
