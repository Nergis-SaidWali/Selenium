import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dependentsPage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        employeeListBtn.click();

        driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]")).click();
        driver.findElement(By.xpath("//a[text()='Dependents']")).click();
        driver.findElement(By.xpath("//input[@id=\"btnAddDependent\"]")).click();


        driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month.click();
        Select select=new Select(month);
        select.selectByValue("2");
        Thread.sleep(3000);
        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click();
        Select select1=new Select(year);
        select1.selectByValue("1990");
        Thread.sleep(3000);
        List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:date
        ) {
            if (day.getText().equalsIgnoreCase("20")) ;
            day.click();
        }


        }
    }
