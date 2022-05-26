package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.attribute.FileTime;

public class Driver {
    private static WebDriver driver;

    public static void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public static WebDriver getDriver(){
        return driver;

    }
    public static void closeDriver(){
        driver.quit();
    }

    public static WebDriver.Navigation navigate() {
        return null;
    }
}
