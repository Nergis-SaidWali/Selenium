package SeleniumClass07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*HomeWork 2
Implicit wait
1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
2. click on get New User
3. get the firstname  of user and print it on console*/
public class Task2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();
        WebElement Btn=driver.findElement(By.xpath("//button[@type='button']"));
        Btn.click();

        WebElement firstName=driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));
        String name=firstName.getText();
        System.out.println(name);

    }
}
