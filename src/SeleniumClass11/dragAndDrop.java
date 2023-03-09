package SeleniumClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement draggable=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action=new Actions(driver);
        //action.dragAndDrop(draggable, droppable).perform();
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
    }
}
