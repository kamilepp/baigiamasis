package tests.seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Registration extends BaseTest {

    @BeforeMethod
    public void openRegistrationForm() {
        pages.seleniumEasy.Registration.open();
    }
    @Test
    public void testInputRegistrationFormFields(){
        pages.seleniumEasy.Registration.enterFirstName("Testname");
        pages.seleniumEasy.Registration.enterLastName("Testlastname");
        pages.seleniumEasy.Registration.enterEmail("testemail@gmail.com");
        pages.seleniumEasy.Registration.enterPassword("test12345");
        pages.seleniumEasy.Registration.pressCreateAccountButton();
    }
}

