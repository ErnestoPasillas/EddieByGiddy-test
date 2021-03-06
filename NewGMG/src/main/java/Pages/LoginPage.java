package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver = PadreClassGMG.getDriver();
    By LoginField = By.cssSelector("#edit-name");

    By Password = By.cssSelector("#edit-pass");

    By LoginBtn = By.cssSelector("#edit-submit");

    By CreateAccount = By.xpath("//a[@href='/user/register']");


    public WebElement getLoginField()
    {
        return driver.findElement(LoginField);
    }

    public WebElement getPassword()
    {
        return driver.findElement(Password);
    }

    public WebElement getLoginBtn()
    {
        return driver.findElement(LoginBtn);
    }

    public WebElement getCreateAccount()
    {
        return driver.findElement(CreateAccount);
    }
}
