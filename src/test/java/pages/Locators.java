package pages;

import org.openqa.selenium.By;

public class Locators {


    public static class Registration {

        public static By inputFirstName = By.xpath("//*[@id='create_customer']/div[1]/input");
        public static By inputLastName = By.xpath("//*[@id='create_customer']/div[2]/input");
        public static By inputEmail = By.xpath("//*[@id='create_customer']/div[3]/input");
        public static By inputPassword = By.xpath("//*[@id='create_customer']/div[4]/input");
        public static By buttonCreateAccount = By.xpath("//*[@id='create_customer']/button");
    }


}

