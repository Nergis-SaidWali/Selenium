package SeleniumClass05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/*1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title*/

public class Task2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
        Select select = new Select(dropDown);
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            WebElement option = options.get(i);
            String text = option.getText();
            System.out.println(text);
            if(text.equalsIgnoreCase("Computers/Tablets & Networking")) {
                select.selectByIndex(i);
            }
        }
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        String title=driver.getTitle();
        System.out.println("Title is: "+title);
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("The title: "+title+" is verified");
        } else{
            System.out.println("The title: "+title+" is not verified");
        }
    }
}
