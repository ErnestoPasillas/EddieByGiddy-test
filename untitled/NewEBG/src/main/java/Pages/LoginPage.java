package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver = PadreClassEBG.getDriver() ;
    By Email = By.id("login_email");

    By Password = By.id("login_pass");

    By LoginBtn = By.cssSelector("#pageBody > div.body > div.container > div > div.login-row > div.account-login-form > form > div.form-actions > input");

    By ForgotPassword = By.className("forgot-password");

    By CreateAccount = By.cssSelector("#pageBody > div.body > div.container > div > div.login-row > div.new-customer > div > div.panel-body > a > button");


    public WebElement getEmail(){
        return driver.findElement(Email);
    }

    public WebElement getPassword(){
        return driver.findElement(Password);
    }

    public WebElement getLoginBtn(){
        return driver.findElement(LoginBtn);
    }

    public WebElement getForgotPassword(){
        return driver.findElement(ForgotPassword);
    }

    public WebElement getCreateAccount() {
        return driver.findElement(CreateAccount);
    }
}
