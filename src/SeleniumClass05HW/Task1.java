package SeleniumClass05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*HW1
1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code
*/

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement newAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        newAccount.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nergis");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ulfet");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nergis_3456@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nergis_3456@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("123456");
        Thread.sleep(2000);
        WebElement dropDown=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select slct=new Select(dropDown);
        slct.selectByVisibleText("8");
        Thread.sleep(2000);
        WebElement dropDown2=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select select=new Select(dropDown2);
        select.selectByVisibleText("Sep");
        Thread.sleep(2000);
        WebElement dropDown3=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select sel=new Select(dropDown3);
        sel.selectByVisibleText("1990");
        Thread.sleep(2000);
        WebElement checkBox=driver.findElement(By.xpath("//label[text()='Female']"));
        checkBox.click();
    }
}
