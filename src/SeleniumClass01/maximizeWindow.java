package SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    //go to google.com
    //maximize your window
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //maximize the window
        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        //quit
        driver.quit();

    }
}
