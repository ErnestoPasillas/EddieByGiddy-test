package Actions;

import Pages.AccountPage;
import Utilities.WaitManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AccountActions {


    AccountPage accountPage = new AccountPage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;



    public void clickOnAccountInfoBtn()
    {

        try {
            WaitManager.waitAndClick(accountPage.getAccountInfo());
        } catch (NoSuchElementException e ){

            e.printStackTrace();
        }

    }

    public void clickOnTopicsOfInterestBtn()
    {


        try {
            WaitManager.waitAndClick(accountPage.getTopicsOfInterest());
        } catch (NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void clickOnAccountSecurityBtn()
    {


        try {
            WaitManager.waitAndClick(accountPage.getAccountSecurity());
        } catch (NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void clickOnAuthorsFollowedBtn()
    {
        WaitManager.waitAndClick(accountPage.getAuthorsFollowed());
    }


    public void clickOnSavedArticlesBtn()
    {
        WaitManager.waitAndClick(accountPage.getSavedArticles());
    }

    public void clickOnQuestionsAnswersBtn()
    {
        WaitManager.waitAndClick(accountPage.getQuestionsAnswers());
    }

    public void clickOnSingOut()
    {
        WaitManager.waitAndClick(accountPage.getSignOut());
    }

}
