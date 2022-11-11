package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static <string> void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //find the button create account and click on it
        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createAccount.click();
        //sleep for 3 seconds to wait for the window to open up
        Thread.sleep(3000);
        //select the date from the dropdown
        //approach to use the select
        //1.Find the WebElement that contains the select tag
        //2.Use the select class Select sel=new Select(WebElement)
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select sel=new Select(day);
        //We have now three methods that can be used with select class
        //1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
        //2.Select by visible text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        //3.Select by value
        sel.selectByValue("16");
        //..............................................................
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Aug");

        //print all the available months in the console if you have a select class
        List<WebElement> Options=selectMonth.getOptions();
        //traverse through the loop and print each WebElement
        for(int i=0; i<Options.size();i++){
            String months=Options.get(i).getText();
            System.out.println(months);
        }
    }
}
