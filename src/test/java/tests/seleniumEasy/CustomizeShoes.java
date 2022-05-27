package tests.seleniumEasy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;
import utils.Driver;
import java.util.concurrent.TimeUnit;

public class CustomizeShoes extends BaseTest {

    @BeforeMethod

    public void openCustomizedShoesPage (){
        pages.seleniumEasy.CustomizeShoes.openCustomizedShoesPage();
    }
    @Test

    public void customizeShoes() throws InterruptedException {

        Driver.getDriver().manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)", "");

        pages.seleniumEasy.CustomizeShoes.selectCustomShoesSize();
        pages.seleniumEasy.CustomizeShoes.clickFirstOption();

        js.executeScript("window.scrollBy(0,200)", "");
        pages.seleniumEasy.CustomizeShoes.clickFirstOptionsDropdown();
        pages.seleniumEasy.CustomizeShoes.clickFirstMaterial();
        pages.seleniumEasy.CustomizeShoes.clickFirstBack();
        js.executeScript("window.scrollBy(0,100)", "");
        TimeUnit.SECONDS.sleep(1);
        pages.seleniumEasy.CustomizeShoes.closeAd();
        pages.seleniumEasy.CustomizeShoes.clickSecondOption();

        TimeUnit.SECONDS.sleep(1);
        js.executeScript("window.scrollBy(0,050)", "");
        pages.seleniumEasy.CustomizeShoes.clickSecondOptionsDropdown();
        pages.seleniumEasy.CustomizeShoes.clickSecondMaterial();
        pages.seleniumEasy.CustomizeShoes.clickSecondBack();
        TimeUnit.SECONDS.sleep(1);
        pages.seleniumEasy.CustomizeShoes.clickThirdOption();
        TimeUnit.SECONDS.sleep(1);

        js.executeScript("window.scrollBy(0,-100)", "");
        pages.seleniumEasy.CustomizeShoes.clickThirdOptionsDropdown();
        pages.seleniumEasy.CustomizeShoes.clickThirdMaterial();
        pages.seleniumEasy.CustomizeShoes.clickThirdBack();
        TimeUnit.SECONDS.sleep(1);
        js.executeScript("window.scrollBy(0,100)", "");
        pages.seleniumEasy.CustomizeShoes.clickFourthOption();
        pages.seleniumEasy.CustomizeShoes.clickFourthMaterial();
        pages.seleniumEasy.CustomizeShoes.clickFourthBack();
        pages.seleniumEasy.CustomizeShoes.addCustomizedShoesToCart();


    }
}
