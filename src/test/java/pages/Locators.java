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

    public static class CustomizeShoes {

        public static By selectCustomizedShoesSize = By.xpath("//*[@id='Dydis']/li[4]/label");
        public static By clickOnFirstOption = By.xpath("//*[@id='steps']/div[1]/div/span");
        public static By clickOnFirstOptionsDropDown = By.xpath("//*[@id='materials']/div[1]/select");
        public static By selectFirstMaterial = By.xpath("//*[@id='materials']/div[1]/select/option[3]");
        public static By clickBackButton1 = By.xpath("//*[@id='materials']/div[1]/a");

        public static By closeAdButton2 = By.xpath("//*[@id='shopify-section-popup']/aside/button");
        public static By clickOnSecondOption = By.xpath("//*[@id='steps']/div[2]/div/span");
        public static By clickOnSecondOptionsDropDown = By.xpath("//*[@id='materials']/div[3]/select");
        public static By selectSecondMaterial = By.xpath("//*[@id='materials']/div[2]/select/option[3]");
        public static By clickBackButton2 = By.xpath("//*[@id='materials']/div[2]/a");
        public static By clickOnThirdOption = By.xpath("//*[@id='steps']/div[3]/div/span");
        public static By clickOnThirdOptionsDropDown = By.xpath("//*[@id'materials']/div[3]/select");
        public static By selectThirdMaterial = By.xpath("//*[@id='materials']/div[3]/select/option[2]");
        public static By clickBackButton3 = By.xpath("//*[@id='materials']/div[3]/a");
        public static By selectFourthOption = By.xpath("//*[@id='steps']/div[4]/div/span");
        public static By selectFourthMaterial = By.xpath("//*[@id='materials']/div[4]/div/label[2]");
        public static By clickBackButton4 = By.xpath("//*[@id='materials']/div[4]/a");
        public static By addCustomShoesToCart = By.xpath("//*[@id='product_form_6596404805686']/button");


    }
}

