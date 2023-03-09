package SeleniumClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        //click on the button "change text to Selenium WebDriver"
        WebElement button1=driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();
        //get the text Selenium WebDriver
        WebElement webDriverText=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        //print out the text on the screen
        System.out.println(webDriverText.getText());


        //TASK2:
        //Click on the button "display button after 10 seconds"
        WebElement button2=driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();
        //as the button appears up after sometime, so in order to click it or get the text from it, we need to
        //define some explicit wait
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        WebElement visibleBtn=driver.findElement(By.xpath("//button[@id='hidden']"));
        System.out.println(visibleBtn.getText());
        visibleBtn.click();


        //TASK3
        //click on the button "Button"


    }
}
