package SeleniumClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWaits {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //implicit Wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to facebook.com
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();

        //click on create new account
        WebElement createNewAccountBtn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccountBtn.click();

        //send the first name
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("abracadabra");

    }
}
