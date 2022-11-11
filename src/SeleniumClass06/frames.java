package SeleniumClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        //Task1:Print the animals on screen and then Select Baby Cat from the dropdown
        //Step1: switch to the frame using index
        driver.switchTo().frame(1);
        //find the text animals and print on screen
        WebElement animalText=driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text=animalText.getText();
        System.out.println(text);

        WebElement dropDown=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Baby Cat");


        //Task2:check the checkbox
        //switch to the main page
        driver.switchTo().defaultContent();
        //switch to the frame containing the sub frame which has checkbox
        driver.switchTo().frame("frame1");
        WebElement inputTxt=driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("abracadabra");

        //finding the frame through xpath and switching using webElement method
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        //find the checkbox
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();


    }
}
