package pages.seleniumEasy;

import org.openqa.selenium.WebElement;
import pages.Common;
import pages.Locators;

import static pages.Common.clickElement;

public class AddToCart {

    public static void open(){
        Common.openUrl("https://www.maslaus.com/collections/jam/products/lime-pie");

}
public static void closeAd() {clickElement(Locators.AddToCart.closeAdButton);}
    public static void clickShoesSize(){
        clickElement(Locators.AddToCart.chooseShoesSize);
    }

    public static void clickShoesQuantity(){
        clickElement(Locators.AddToCart.addQuantity);
    }
    public static void addShoesToCartButton(){clickElement(Locators.AddToCart.pressAddToCartButton); }
}
