import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class hadibe {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

//        get all the ids from the columns

        List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        boolean flag = true;

        while (!flag) {
            for (int row = 1; row < columnID.size(); row++) {
                List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[" + row + "]/td"));
                //System.out.println(tableRows.get(row).getText());

                for (int column = 1; column < tableColumns.size(); column++) {
                    String columnValue = tableColumns.get(column).getText();

                    if (columnValue.equals("41991A")) {
                        driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + row + "]/td[1]")).click();
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) {
                driver.findElement(By.linkText("Next")).click();
            }
        }
    }
}
