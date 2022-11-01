package SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        //Task2:
        // go to google.com
        // go to facebook.com
        // go back to google.com


                //set the path to the driver to link it with our class, on mac you don't need to use .exe
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                //create a WebDriver instance
                WebDriver driver = new ChromeDriver();
                //use the get() function to open up the required website
                driver.get("https://www.google.com/");
                //go to facebook
                driver.navigate().to("https://www.facebook.com/");
                //introduce some sleep which is waiting
                // or pause for 2000 milliseconds which is 2 seconds
                Thread.sleep(2000);
                //go back to google
                driver.navigate().back();
                //wait for 2 seconds
                Thread.sleep(2000);
                //go back to facebook
                driver.navigate().forward();
                //refresh the page
                //wait for 2 seconds
                Thread.sleep(1000);
                //refresh the page
                driver.navigate().refresh();
                //quit
                driver.quit();

            }
        }

