package Test;

import Pages.loginPage;
import utils.commonMethods;

public class LoginPageTest {
    public static void main(String[] args) {
        commonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPage login=new loginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}
