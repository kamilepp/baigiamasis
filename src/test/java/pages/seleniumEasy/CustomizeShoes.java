package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class CustomizeShoes {

    public static void openCustomizedShoesPage() {
        Common.openUrl("https://www.maslaus.com/collections/individualizacija-3d/products/slyvos-3d-i3afxs");
    }

    public static void selectCustomShoesSize() {
        Common.clickElement(Locators.CustomizeShoes.selectCustomizedShoesSize);
    }

    public static void clickFirstOption() {
        Common.clickElement(Locators.CustomizeShoes.clickOnFirstOption);
    }

    public static void clickFirstOptionsDropdown() {
        Common.clickElement(Locators.CustomizeShoes.clickOnFirstOptionsDropDown);

    }

    public static void clickFirstMaterial() {
        Common.clickElement(Locators.CustomizeShoes.selectFirstMaterial);
    }

    public static void clickFirstBack() {
        Common.clickElement(Locators.CustomizeShoes.clickBackButton1);

    }

    public static void clickSecondOption() {
        Common.clickElement(Locators.CustomizeShoes.clickOnSecondOption);

    }

    public static void clickSecondOptionsDropdown() {
        Common.clickElement(Locators.CustomizeShoes.clickOnSecondOptionsDropDown);

    }

    public static void clickSecondMaterial() {
        Common.clickElement(Locators.CustomizeShoes.selectSecondMaterial);

    }

    public static void clickSecondBack() {
        Common.clickElement(Locators.CustomizeShoes.clickBackButton2);

    }

    public static void clickThirdOption() {
        Common.clickElement(Locators.CustomizeShoes.clickOnThirdOption);
    }

    public static void clickThirdOptionsDropdown() {
        Common.clickElement(Locators.CustomizeShoes.clickOnThirdOptionsDropDown);
    }

    public static void clickThirdMaterial() {
        Common.clickElement(Locators.CustomizeShoes.selectThirdMaterial);
    }

    public static void clickThirdBack() {
        Common.clickElement(Locators.CustomizeShoes.clickBackButton3);
    }

    public static void clickFourthOption() {
        Common.clickElement(Locators.CustomizeShoes.selectFourthOption);
    }

    public static void clickFourthMaterial() {
        Common.clickElement(Locators.CustomizeShoes.selectFourthMaterial);
    }

    public static void clickFourthBack() {
        Common.clickElement(Locators.CustomizeShoes.clickBackButton4);
    }

    public static void addCustomizedShoesToCart(){
        Common.clickElement(Locators.CustomizeShoes.addCustomShoesToCart);
    }

    public static void closeAd() {
        Common.clickElement(Locators.CustomizeShoes.closeAdButton2);
    }
}
