package SeleniumClass07HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*HomeWork3: (do not use thread .sleep  or Explicit wait)
        1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
        2.Click on start button
        3. get the text Welcome Syntax technologies and print on console
        the text will be Empty
        write down  whatever the reason you understand  of text being empty after exploring DOM*/
public class Task3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();
        WebElement startBtn=driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();
        WebElement printTxt=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String txt=printTxt.getText();
        System.out.println("The text is: "+txt);
        /*The text is empty because DOM and UI are not synchronized. When we run the code, first the element is found in the DOM
         and before the title appears on the page timeout occurs. The reason is that implicit wait prioritizes the element in the DOM, if it is
         found, implicit wait ends immediately. */
    }
}
