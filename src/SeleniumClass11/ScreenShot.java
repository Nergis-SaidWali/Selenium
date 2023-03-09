package SeleniumClass11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
        public static void main(String[] args) throws IOException {
            //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //        maximize
            driver.manage().window().maximize();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        username Text Box
                    WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
            userName.sendKeys("Tester", Keys.TAB);

//        password field
            WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
            pass.sendKeys("test",Keys.ENTER);

            TakesScreenshot ss=(TakesScreenshot)driver;
            File sourceFile=ss.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminLogin.png"));

        }
}

