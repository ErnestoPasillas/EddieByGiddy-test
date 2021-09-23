package Actions;

import Pages.LoginPage;
import Utilities.WaitManager;
import org.openqa.selenium.NoSuchElementException;

public class LoginActions {


    LoginPage loginPage = new LoginPage();



    public void emailSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(loginPage.getEmail());

            loginPage.getEmail().clear();
            loginPage.getEmail().sendKeys("qagiddy1@gmail.com");

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


    public void clickOnLogiBtn(){
        WaitManager.waitAndClick(loginPage.getLoginBtn());
    }


    public void clickOnForgotPassword(){
        WaitManager.waitAndClick(loginPage.getForgotPassword());
    }

    public void clickOnCreateAccount(){
        WaitManager.waitAndClick(loginPage.getCreateAccount());
    }
}
