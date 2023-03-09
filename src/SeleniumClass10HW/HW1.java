package SeleniumClass10HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) throws IOException {
        String path="Data/Class09.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(properties.getProperty("URL"));
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys(properties.getProperty("Username"));
        WebElement passWord=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        passWord.sendKeys(properties.getProperty("Password"));
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement recruitmentTab=driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentTab.click();
        WebElement calendar=driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendar.click();
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Aug");
        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        year.click();
        Select sel1=new Select(year);
        sel1.selectByVisibleText("2023");
        List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:days) {
            if(day.getText().equalsIgnoreCase("8")){
                day.click();
            }
        }

    }
}
