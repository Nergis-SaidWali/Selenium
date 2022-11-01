package SeleniumClass03HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='list-group-item'and @href='basic-first-form-demo.php']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
