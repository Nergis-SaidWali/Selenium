package SeleniumClass07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//**HomeWork 1**
//**WindowHandles**
//1.goto
//http://accounts.google.com/signup
//2.click on help and privacy btn
//3.click on community Button
//4.goto gmail.com page and enter your user name in form
public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        String gmail = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("The current page under focus is " + title);
                break;
            }
        }
            WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
            communityBtn.click();

            driver.switchTo().window(gmail);
            WebElement userName = driver.findElement(By.id("Username"));
            userName.sendKeys("Nergis");

        }
    }

