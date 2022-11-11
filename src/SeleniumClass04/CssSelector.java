package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        WebElement textbox= driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textbox.sendKeys("Abracadabra");
        WebElement button=driver.findElement(By.cssSelector("button[onclick^='showIn']"));
        button.click();
    }
}
