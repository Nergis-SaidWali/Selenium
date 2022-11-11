package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a webdriver instance
        WebDriver driver = new ChromeDriver();
        //go to syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //get the radio button Male
        WebElement maleRadioBtn= driver.findElement(By.xpath("//input[@name='optradio' and  @value='Male']"));
        //check if the radio btn is displayed
        Boolean displayStatus=maleRadioBtn.isDisplayed();
        //print the display status
        System.out.println("The radio button is displayed: "+displayStatus);
        //heck whether the radio button male is Enabled
        Boolean enableStatus=maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled: "+enableStatus);
        //  check whether the radio button male is selcted
        Boolean selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio buttons is Selected: "+selectStatus);
        //check if the radio button male is not selected then click on it
        if(!selectStatus){
            maleRadioBtn.click();
        }
        //perform a click operation on the radio button
        selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected: "+selectStatus);
    }
}

