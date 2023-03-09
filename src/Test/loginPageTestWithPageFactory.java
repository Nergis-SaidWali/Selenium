package Test;

import utils.commonMethods;
import Pages.loginPageWithPageFactory;
public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        commonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPageWithPageFactory login =new loginPageWithPageFactory();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginBtn.click();
    }
}
