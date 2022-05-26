package tests.seleniumEasy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.concurrent.TimeUnit;

public class SearchItem extends BaseTest {

    @BeforeMethod

    public void openMainPage() {
        pages.seleniumEasy.SearchItem.openMainPage();
    }
    @Test
    public void clickSearchButton() throws InterruptedException {
        pages.seleniumEasy.SearchItem.clickSearchButtonInMainPage();
        pages.seleniumEasy.SearchItem.enterAnyShoesName("California");
        TimeUnit.SECONDS.sleep(2);
        pages.seleniumEasy.SearchItem.closeSearchWindow();
    }
}
