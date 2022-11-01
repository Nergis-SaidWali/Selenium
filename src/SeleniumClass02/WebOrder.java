package SeleniumClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class WebOrder {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
            driver.manage().window().maximize();
            driver.findElement(By.name("ct100$MainContent$username")).sendKeys("Tester");
            driver.findElement(By.id("ct100_MainContent_password")).sendKeys("test");
            driver.findElement(By.className("button")).click();
            //make sure that the title is correct i.e Web Orders
            //get the title of the page
            String title=driver.getTitle();

            if(title.equalsIgnoreCase("Web Orders")){
                System.out.println(title);
            } else{
                System.out.println("The title is incorrect");
            }

        }
    }