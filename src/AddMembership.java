import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddMembership {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        driver.findElement(By.xpath("//b[text()='Admin']")).click();
        driver.findElement(By.xpath("//a[text()='Qualifications']")).click();
        driver.findElement(By.xpath("//a[text()='Memberships']")).click();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        driver.findElement(By.xpath("//input[@id='membership_name']")).sendKeys("GolfClub1");
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        List<WebElement> membershipNames=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0; i<membershipNames.size(); i++){
            String membershipName=membershipNames.get(i).getText();
            String expectedName="GolfClub1";
            if(membershipName.equalsIgnoreCase(expectedName)){
                System.out.println("The membership is added succesfully");
            }
        }

    }
}
