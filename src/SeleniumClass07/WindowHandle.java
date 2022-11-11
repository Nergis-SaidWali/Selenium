package SeleniumClass07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Task:Go to gmail signup and get the window handle
        driver.get("http://accounts.google.com/signup");
        String gmailHandle=driver.getWindowHandle();
        System.out.println("The handle of the current page is :"+gmailHandle);

    }
}
