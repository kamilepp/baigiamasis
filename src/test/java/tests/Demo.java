package tests;

import org.testng.annotations.Test;
import utils.Driver;

public class Demo extends BaseTest {

    @Test
    public void openGoogle(){
        Driver.getDriver().get("https://www.google.com");
    }
}
