package SeleniumClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingAdvance {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        //click on help button
        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privacy button
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        //Title of my desired page is "Google Account Help"

        //get all the window handles
        Set<String> allHandles=driver.getWindowHandles();

        for(String handle:allHandles) {
            //switching the focus to the current handle from the list
            driver.switchTo().window(handle);
            //get the title of the window to which the driver has switched
            String title = driver.getTitle();
            //compare if the title is of the help page
            if (title.equalsIgnoreCase("Google Account Help")) ;
            System.out.println("The current page under focus is " + title);
            break;
        }
            //        find the community button and click on it
            WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
            communityBtn.click();

        }

    }

