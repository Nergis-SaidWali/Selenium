package SeleniumClass02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with our class, on mac you don't need to use .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("open-registration-form-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Nergis");
        driver.findElement(By.name("lastname")).sendKeys("SaidWali");
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();
    }
}