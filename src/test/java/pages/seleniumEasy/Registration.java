package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import static pages.Common.clickElement;

public class Registration {
    public static void open() {

        Common.openUrl("https://www.maslaus.com/en/account/register");


    }

    public static String enterFirstName(String keys) {
        Common.sendKeysToElement(Locators.Registration.inputFirstName, "Testname");
        return keys;
    }

    public static String enterLastName(String keys) {
        Common.sendKeysToElement(Locators.Registration.inputLastName, "Testlastname");
        return keys;
    }

    public static String enterEmail(String keys) {
        Common.sendKeysToElement(Locators.Registration.inputEmail, "testemail@gmail.com");
        return keys;
    }

    public static String enterPassword(String keys) {
        Common.sendKeysToElement(Locators.Registration.inputPassword, "test12345");
        return keys;
    }

    public static void pressCreateAccountButton() {
        clickElement(Locators.Registration.buttonCreateAccount);

    }
}