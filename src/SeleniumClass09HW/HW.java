package SeleniumClass09HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class HW {
    public static void main(String[] args) throws IOException {
        String path="Data/config.properties";
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
        WebElement PIMBtn=driver.findElement(By.xpath("//b[text()='PIM']"));
        PIMBtn.click();
        WebElement empList=driver.findElement(By.xpath("//a[text()='Employee List']"));
        empList.click();
        List<WebElement> idColumn=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0; i<idColumn.size(); i++) {
            String columnTxt = idColumn.get(i).getText();
            if (columnTxt.equalsIgnoreCase("44869A")){
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();
            }
        }
    }
}
