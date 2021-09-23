package Actions;

import Pages.LoginPage;
import Utilities.WaitManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginActions {



    LoginPage loginPage = new LoginPage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;


    public void emailSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(loginPage.getLoginField());

            loginPage.getLoginField().clear();
            loginPage.getLoginField().sendKeys("qagiddy1@gmail.com");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }



    public void emailSetTextFail()
    {
        try {
            WaitManager.waitForElementToBePresent(loginPage.getLoginField());

            loginPage.getLoginField().clear();
            loginPage.getLoginField().sendKeys("qagiddy1@g");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void passwordSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(loginPage.getPassword());

            loginPage.getPassword().clear();
            loginPage.getPassword().sendKeys("123");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void clickOnLoginBtn()
    {
        WaitManager.waitAndClick(loginPage.getLoginBtn());
    }

    public void clickOnCreateAccount()
    {
        WaitManager.waitAndClick(loginPage.getCreateAccount());
    }


}
