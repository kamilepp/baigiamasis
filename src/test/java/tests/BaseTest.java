package tests;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import utils.Driver;
import utils.TestListener;


@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public void setup(){
        Driver.setDriver();

    }

}
