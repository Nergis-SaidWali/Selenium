package SeleniumClass08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW {
    //HW
    //go to https://the-internet.herokuapp.com/dynamic_controls
    //click on checkbox and click on remove
    //verify the text
    //click on enable verify the textbox is enabled
    //enter text and click disable
    //verify the text box is disabled

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //click on checkbox
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        //click on remove
        WebElement removeBtn=driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();
        //verify text
        WebElement text=driver.findElement(By.xpath("//p[@id='message']"));
        String verifyText=text.getText();
        if(text.getText().equalsIgnoreCase("It's gone!")){
            System.out.println("The text "+"/"+verifyText+"/"+" is verified.");
        }else {
            System.out.println(verifyText+" is not verified.");
        }
        //click on enable verify the text box is enabled
        WebElement enabledBtn=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enabledBtn.click();
        WebElement enabled=driver.findElement(By.xpath("//p[@id='message']"));
        String enabledText=enabled.getText();
        System.out.println("The text after enabling is: "+enabledText);
        System.out.println("The text box is enabled -"+enabled.isEnabled());
        //enter text and click disable
        WebElement sendText=driver.findElement(By.xpath("//input[@type='text']"));
        sendText.sendKeys("Selenium");
        WebElement disableBtn=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableBtn.click();
        //verify the text box is disabled
        WebElement disable=driver.findElement(By.xpath("//p[@id='message']"));
        String disableText=disable.getText();
        System.out.println("The text after disabling is: "+disableText);
        System.out.println("The text box is disabled -"+disable.isEnabled());

    }
}
