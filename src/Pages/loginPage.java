package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.commonMethods;

public class loginPage extends commonMethods {

        public WebElement userNameField = driver.findElement(By.id("txtUsername"));
        public WebElement passwordField = driver.findElement(By.id("txtPassword"));
        public WebElement loginButton = driver.findElement(By.id("btnLogin"));
        public WebElement loginSign = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));


}
