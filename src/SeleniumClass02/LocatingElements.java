package SeleniumClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatingElements  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ///Task1: go to fb.com, enter username, enter password, login
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("NergisOulfet");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("123abc");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();


        //task2: click on forgot password
        //for the following task to work please make sure that you comment the login functionality
        driver.findElement(By.linkText("Forgotten password?")).click();

        //task3: click on forgot password using partial linktext locator
        //for the following task to work please make sure that you comment the login functionality
        driver.findElement(By.partialLinkText("password?")).click();
    }
}

