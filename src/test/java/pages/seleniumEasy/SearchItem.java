package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import java.time.LocalTime;

public class SearchItem {

    public static void openMainPage(){
        Common.openUrl("https://www.maslaus.com");

    }
    public static void clickSearchButtonInMainPage(){
        Common.clickElement(Locators.SearchItem.pressSearchButton);
    }
    public static void enterAnyShoesName(String keys){
        Common.sendKeysToElement(Locators.SearchItem.inputShoesName, "California");

    }
    public static void closeSearchWindow(){
        Common.clickElement(Locators.SearchItem.searchWindowCloses);

    }
}
