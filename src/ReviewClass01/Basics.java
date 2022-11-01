package ReviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[text()='Create New Account")).click();
            driver.findElement(By.xpath(" //input[@name='firstname']")).sendKeys("zameer");
            driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("zombiee");
            driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t")).click();
        }
    }

