package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static String sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
        return keys;
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

}





