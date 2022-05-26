package tests.seleniumEasy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class AddToCart extends BaseTest {

    @BeforeMethod

    public void openChosenShoesPage() {
        pages.seleniumEasy.AddToCart.open();
    }

    @Test

    public static void testAddShoesToCart() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,350)", "");

            pages.seleniumEasy.AddToCart.closeAd();
            TimeUnit.SECONDS.sleep(1);
            pages.seleniumEasy.AddToCart.clickShoesSize();
            TimeUnit.SECONDS.sleep(1);
            pages.seleniumEasy.AddToCart.clickShoesQuantity();
            TimeUnit.SECONDS.sleep(1);
            pages.seleniumEasy.AddToCart.addShoesToCartButton();
        }
    }

