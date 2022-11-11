package SeleniumClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        //Task1:Check the Checkbox
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        WebElement innerFrame=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(innerFrame);
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        //Task2:Select Baby Cat from dropdown
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame2);
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Baby Cat");
        //Task3:Send text in text box "DONE"
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frame1);
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("DONE");

    }
}
