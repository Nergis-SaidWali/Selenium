package SeleniumClass02HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    class Task1 {
        public static void main(String[] args) {
            //set the path to the driver to link it with our class, on mac you don't need to use .exe
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            //create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            //use the get() function to open up the required website
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.manage().window().maximize();
            driver.findElement(By.id("customer.firstName")).sendKeys("Nergis");
            driver.findElement(By.id("customer.lastName")).sendKeys("SaidWali");
            driver.findElement(By.name("customer.adress.street")).sendKeys("Gencosman,Ayaz");
            driver.findElement(By.id("customer.address.city")).sendKeys("Gungoren");
            driver.findElement(By.id("customer.address.state")).sendKeys("Istanbul");
            driver.findElement(By.name("customer.address.zipCode")).sendKeys("34165");
            driver.findElement(By.id("customer.phoneNumber")).sendKeys("5341898765");
            driver.findElement(By.id("customer.ssn")).sendKeys("123 45 6789");
            driver.findElement(By.name("customer.username")).sendKeys("CanGS");
            driver.findElement(By.id("customer.password")).sendKeys("123abc");
            driver.findElement(By.id("repeatedPassword")).sendKeys("123abc");
            driver.findElement(By.className("button")).click();
            driver.quit();

        }
    }