package SeleniumClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //        check the checkBox that contains "screen saver" as a product
        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
//        traverse through the list

        /*for(int i=0; i<secondColumn.size();i++){
//    i=0
            String columnText = secondColumn.get(i).getText();   //ScreenSaver
//            check for the desired value
            if(columnText.equalsIgnoreCase("ScreenSaver")){
//   print out the index of the column/row which contains the Screen saver
                System.out.println("the index of the row which contains the Screen Saver is "+ (i+1));

                //
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkBox.click();
*/
        for(int i = 0; i<secondColumn.size(); i++) {
            String text = secondColumn.get(i).getText();
            if(text.equalsIgnoreCase("ScreenSaver")) {
                List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type ='checkbox']"));
                allCheckBoxes.get(i).click();
            }
        }


    }
}
