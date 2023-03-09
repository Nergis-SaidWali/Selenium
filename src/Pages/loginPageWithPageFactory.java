package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class loginPageWithPageFactory extends commonMethods {
    @FindBy(id="txtUsername")
    public WebElement userNameField;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    public loginPageWithPageFactory(){
        PageFactory.initElements(driver, this);
    }



}
