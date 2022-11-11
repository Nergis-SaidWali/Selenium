package Seleniumclass04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passWord=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement clickLogin=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        clickLogin.click();
        WebElement message=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
        System.out.println("The message 'Welcome Admin' is displayed on the top right corner: "+ message.isDisplayed());
    }
}

