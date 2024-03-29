package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class commonMethods {
    //the webDriver instance is accessible in all the methods now
    public static WebDriver driver;
    public static void openWithSpecificUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        driver.quit();
    }
}
