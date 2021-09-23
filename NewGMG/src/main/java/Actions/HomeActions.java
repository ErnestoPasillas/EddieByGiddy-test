package Actions;

import Pages.HomePage;
import Utilities.WaitManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HomeActions {

    HomePage homePage = new HomePage();

    SoftAssert softAssert = new SoftAssert();

    WebDriverWait wait = null;




    public void searchSetText()
    {
        try {
            WaitManager.waitForElementToBePresent(homePage.getSearchField());

            homePage.getSearchField().clear();
            homePage.getSearchField().sendKeys("education");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }


    public void searchSetWrongText()
    {
        try {
            WaitManager.waitForElementToBePresent(homePage.getSearchField());

            homePage.getSearchField().clear();
            homePage.getSearchField().sendKeys("ababsjdje");

        }catch(NoSuchElementException e ){

            e.printStackTrace();
        }
    }

    public void clickOnSearchBtn()
    {
        WaitManager.waitAndClick(homePage.getSearchBtn());
    }


    public void clickOnTagSearchBtn()
    {
        WaitManager.waitAndClick(homePage.getTagSearch());
    }

    public void clickOnLoginBtn()
    {
        WaitManager.waitAndClick(homePage.getLogin());
    }

    public void clickOnCarouselBtn()
    {
        WaitManager.waitAndClick(homePage.getCarousel());
    }

    public void clickOnAuthorsBtn()
    {
        WaitManager.waitAndClick(homePage.getFooterAuthors());
    }


    public void clickOnCreateAccountBanner()
    {
        WaitManager.waitAndClick(homePage.getCreateAccountBanner());
    }

    public void clickOnMyAccount()
    {
        WaitManager.waitAndClick(homePage.getMyAccount());
    }


    public void clickOnWatchVideo(){
        WaitManager.waitAndClick(homePage.getVideoBanner());
    }


    public void searchResultValidation(){

        WaitManager.waitForElementToBePresent(homePage.getSearchResult());
        Assert.assertTrue(homePage.getSearchResult().isDisplayed());
    }


    public void searchResultValidation2(){

        WaitManager.waitForElementToBePresent(homePage.getSearchResult());
        Assert.assertTrue(homePage.getSearchResult().isDisplayed());
    }

}
