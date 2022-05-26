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

    public static class Login {

        public static By inputValidEmail = By.xpath("//*[@id='customer_login']/div[1]/input");
        public static By inputValidPassword = By.xpath("//*[@id='customer_login']/div[2]/input");
        public static By buttonLogin = By.xpath("//*[@id='customer_login']/button");


    }

    public static class AddToCart {

        public static By closeAdButton = By.xpath("//*[@id='shopify-section-popup']/aside/button");
        public static By chooseShoesSize = By.xpath("//*[@id='product_form_6769300176950']/div[1]/div[1]/ul/li[5]/label");
        public static By addQuantity = By.xpath("//*[@id='product_form_6769300176950']/div[1]/div[3]/div/span[2]");
        public static By pressAddToCartButton = By.xpath("//*[@id='product_form_6769300176950']/button");

    }

    public static class SearchItem {

        public static By pressSearchButton = By.xpath("//*[@id='section-header']/div/div[3]/a[2]");
        public static By inputShoesName = By.xpath("//*[@id='Search']/div/div[1]/form/input[1]");

        public static By searchWindowCloses = By.xpath("//*[@id='Search']/div/div[1]/button");

    }
}

