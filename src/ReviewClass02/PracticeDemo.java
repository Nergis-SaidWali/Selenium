package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        //setting up the WebDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create an instance
        WebDriver driver = new ChromeDriver();
        //open the Syntax HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        // When user sends in the username 'Admin'
        WebElement userName=driver.findElement(By.id("txtUsername"));
        //send the username
        userName.sendKeys("Admin");
        //Then user sends in the wrong password
        WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");

        //Then user click on login button
        WebElement btn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

        //Then verify that the error 'Invalid Credentials' is displayed
        //get the error message from the DOM
        WebElement errorMSG=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        //get the text of the error
        String error=errorMSG.getText();

        //verification part
        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("The correct message is there ----> verified");
        } else {
            System.out.println("The correct message is not there");
        }



    }
}
