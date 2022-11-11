package Seleniumclass04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement clickLogin=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        clickLogin.click();
        WebElement spanMessage=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
        String message= spanMessage.getText();
        boolean displayStatus=spanMessage.isDisplayed();

        if(displayStatus){
            System.out.println("/"+message+"/"+" is displayed: "+displayStatus);
        } else {
            System.out.println("/"+message+"/"+" is displayed: "+displayStatus);
        }
    }
}
