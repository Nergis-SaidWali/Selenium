package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //find the web element button
        WebElement btn=driver.findElement(By.cssSelector("button#buttoncheck"));
        //get the text from the btn web element
        String text= btn.getText();
        //print it on console
        System.out.println("the text in the button is: "+text);

        //get the value of the attribute "id" from this WebElement
        String idValue=btn.getAttribute("id");
        //print it on the console
        System.out.println("The value of the attribute id is: "+idValue);

    }
}

