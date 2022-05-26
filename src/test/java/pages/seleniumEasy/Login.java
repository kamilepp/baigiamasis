package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import static pages.Common.clickElement;

public class Login {

    public static void open() {

        Common.openUrl("https://www.maslaus.com/en/account/login?return_url=%2Fen%2Faccount");


    }

    public static String enterValidEmail(String keys) {
        Common.sendKeysToElement(Locators.Login.inputValidEmail, "testemail@gmail.com");
        return keys;
    }

    public static String enterValidPassword(String keys) {
        Common.sendKeysToElement(Locators.Login.inputValidPassword, "test12345");
        return keys;
    }

    public static void pressLoginButton() {
        clickElement(Locators.Login.buttonLogin);
    }
}
