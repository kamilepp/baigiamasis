package tests.seleniumEasy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {
    @BeforeMethod
    public void openLoginPage() {
        pages.seleniumEasy.Login.open();
    }
    @Test
    public void testInputLoginFormFields(){

        pages.seleniumEasy.Login.enterValidEmail("testemail@gmail.com");
        pages.seleniumEasy.Login.enterValidPassword("test12345");
        pages.seleniumEasy.Login.pressLoginButton();

    }
}


